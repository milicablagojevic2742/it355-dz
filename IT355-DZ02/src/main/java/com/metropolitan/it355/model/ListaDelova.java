/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Blagojevic Milica
 */
public class ListaDelova {
    private List<Deo> lista;
    
    public ListaDelova() {
        lista = new ArrayList<Deo>();
    }
    
    /**
     * @return the lista
     */
    public List<Deo> getLista() {
        return lista;
    }
    
    /**
     * @param lista the lista to set
     */
    public void setLista(List<Deo> lista) {
        this.lista = lista;
    }
    
    public void addDeo(Deo k){
        lista.add(k);
    }
    
    public Deo getDeo(int index){
        return lista.get(index);
    }
    
    public List<Map<String, Object>> getListPoruka(){
        List<Map<String, Object>> list = new ArrayList<>();
        for(Deo d: lista){
            Map<String, Object> tempKontaktMap = new HashMap<>();
            tempKontaktMap.put("ime", d.getIme());
            tempKontaktMap.put("cena", d.getCena());
            list.add(tempKontaktMap);
        }
        return list;
    }
}
