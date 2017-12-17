/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.it355.dz02;

import com.metropolitan.it355.dao.DeoDao;
import com.metropolitan.it355.dao.KategorijaDao;
import com.metropolitan.it355.dao.UserDao;
import com.metropolitan.it355.model.Deo;
import com.metropolitan.it355.model.Kategorija;
import com.metropolitan.it355.model.User;
import com.metropolitan.it355.service.DeoService;
import com.metropolitan.it355.service.KategorijaService;
import com.metropolitan.it355.service.UserService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Blagojevic Milica
 */
@Controller
public class DZ02Controller {

    @Autowired
    UserDao userDao;

    @Autowired
    DeoDao deoDao;

    @Autowired
    KategorijaDao kategorijaDao;

    @Autowired
    UserService userService;

    @Autowired
    DeoService deoService;

    @Autowired
    KategorijaService kategorijaService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView defaultPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "Dobrodošli u online prodavnicu auto delova!");
        model.setViewName("DZ02");
        return model;
    }

    @RequestMapping(value = "/kontakt", method = RequestMethod.GET)
    public ModelAndView kontaktPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("kontakt");
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid login information!");
        }
        if (logout != null) {
            model.addObject("msg", "You are logged out");
        }
        model.setViewName("login");
        return model;
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {
        ModelAndView model = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            System.out.println(userDetail);
            model.addObject("username", userDetail.getUsername());
        }
        model.setViewName("403");
        return model;
    }

    @RequestMapping(value = "/addDeo**", method = RequestMethod.GET)
    public String addDeo(Model model) {
        model.addAttribute("deo", new Deo());
        List<Kategorija> kategorije = kategorijaDao.getAllKategorija();
        for (Kategorija kategorija : kategorije) {
            System.err.println(kategorija.toString());
        }
        model.addAttribute("kategorije", kategorije);
        return "addDeo";
    }

    @RequestMapping(value = "/addDeo**", method = RequestMethod.POST)
    public ModelAndView addDeo(@ModelAttribute("deo") Deo d, ModelAndView model) {
        model.addObject("object", d);
        d.setSifra(deoDao.getCount() + 1);
        deoService.addDeo(d);
        return model;
    }

    @RequestMapping(value = "/listaDelova", method = RequestMethod.GET)
    public ModelAndView listDeo(ModelAndView modelAndView) {
        List<Deo> delovi = deoDao.getAllDeo();
        for (Deo deo : delovi) {
            System.err.println(deo.toString());
        }
        modelAndView.addObject("delovi", delovi);
        modelAndView.setViewName("listaDelova");
        return modelAndView;
    }

    @RequestMapping(value = "/editDeo/{sifra}", method = RequestMethod.GET)
    public String editDeo(@PathVariable("sifra") int id, Model model) {
        Deo deo = deoDao.getDeoByID(id);
        model.addAttribute("deo", deo);
        model.addAttribute("kategorije", kategorijaDao.getAllKategorija());
        return "addDeo";
    }

    @RequestMapping(value = "/editDeo/{sifra}", method = RequestMethod.POST)
    public String editDeo(@PathVariable("sifra") int id, @ModelAttribute("deo") Deo d, ModelAndView model) {
        model.addObject("deo", d);
        deoService.editDeo(d);
        return "DZ02";
    }

    @RequestMapping(value = "/deleteDeo/{sifra}", method = RequestMethod.GET)
    public String deleteDeo(@PathVariable("sifra") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting product with id " + id);
        Deo deo = deoDao.getDeoByID(id);
        if (deo == null) {
            System.out.println("Unable to delete. Product with id " + id + " notfound");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        deoDao.deleteDeo(deo);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = "/addKategorija", method = RequestMethod.GET)
    public String addKategorija(Model model) {
        model.addAttribute("kategorija", new Kategorija());
        return "addKategorija";
    }

    @RequestMapping(value = "/addKategorija", method = RequestMethod.POST)
    public ModelAndView addKategorija(@ModelAttribute("kategorija") Kategorija k, ModelAndView model) {
        model.addObject("object", k);
        k.setKategorija_id(kategorijaDao.getCount() + 1);
        kategorijaService.addKategorija(k);
        return model;
    }

    @RequestMapping(value = "/listaKategorija", method = RequestMethod.GET)
    public ModelAndView listaKategorija(ModelAndView modelAndView) {
        List<Kategorija> kategorije = kategorijaDao.getAllKategorija();
        for (Kategorija kategorija : kategorije) {
            System.err.println(kategorija.toString());
        }
        modelAndView.addObject("kategorije", kategorije);
        modelAndView.setViewName("listaKategorija");
        return modelAndView;
    }

    @RequestMapping(value = "/editKategorija/{kategorija_id}", method = RequestMethod.GET)
    public String editKategorija(@PathVariable("kategorija_id") int id, Model model) {
        Kategorija k = kategorijaDao.getKategorijaByID(id);
        model.addAttribute("kategorija", k);
        return "addKategorija";
    }

    @RequestMapping(value = "/editKategorija/{kategorija_id}", method = RequestMethod.POST)
    public String editKategorija(@PathVariable("kategorija_id") int id, @ModelAttribute("kategorija") Kategorija k, ModelAndView model) {
        model.addObject("kategorija", k);
        kategorijaService.editKategorija(k);
        return "DZ02";
    }

    @RequestMapping(value = "/deleteKategorija/{kategorija_id}", method = RequestMethod.GET)
    public String deleteKategorija(@PathVariable("kategorija_id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting product with id " + id);
        Kategorija k = kategorijaDao.getKategorijaByID(id);
        if (k == null) {
            System.out.println("Unable to delete. Product with id " + id + " notfound");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        kategorijaDao.deleteKategorija(k);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
    
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User u, ModelAndView model) {
        model.addObject("object", u);
        u.setUser_id(userDao.getCount() + 1);
        userService.addUser(u);
        return model;
    }

    @RequestMapping(value = "/listaUsera", method = RequestMethod.GET)
    public ModelAndView listaUsera(ModelAndView modelAndView) {
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.err.println(user.toString());
        }
        modelAndView.addObject("users", users);
        modelAndView.setViewName("listaUsera");
        return modelAndView;
    }
    
    @RequestMapping(value = "/editUser/{user_id}", method = RequestMethod.GET)
    public String editUser(@PathVariable("user_id") int id, Model model) {
        User u = userDao.getUserByID(id);
        model.addAttribute("user", u);
        return "addUser";
    }

    @RequestMapping(value = "/editUser/{user_id}", method = RequestMethod.POST)
    public String editUser(@PathVariable("user_id") int id, @ModelAttribute("user") User u, ModelAndView model) {
        model.addObject("user", u);
        userService.editUser(u);
        return "DZ02";
    }

    @RequestMapping(value = "/deleteUser/{user_id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("user_id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting product with id " + id);
        User u = userDao.getUserByID(id);
        if (u == null) {
            System.out.println("Unable to delete. Product with id " + id + " notfound");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }
        userDao.deleteUser(u);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

}
