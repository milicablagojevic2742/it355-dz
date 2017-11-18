/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.it355.dz02;

import com.metropolitan.it355.model.Deo;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Blagojevic Milica
 */
@Controller
public class DeloviController {

    @Autowired
    private MessageSource messageSource;
    
    @RequestMapping(value = "/addDeo", method = RequestMethod.POST)
    public String addDeo(@ModelAttribute Deo deo, ModelMap model) {
        model.addAttribute("sifra", deo.getSifra());
        model.addAttribute("ime", deo.getIme());
        model.addAttribute("cena", deo.getCena());
        return "viewDeo";
    }

    @RequestMapping(value = "/deo", method = RequestMethod.GET)
    public ModelAndView delovi() {
        System.out.println("Calling MessageSource");
        System.out.println(messageSource.getMessage("ime", null, new Locale("sr-Latn-RS")));
        return new ModelAndView("deo", "command", new Deo());
    }
}
