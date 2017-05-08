/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video13;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public static void main (String []args){
        Set<Persona> lista=new HashSet<>();
        lista.add(new Persona(2,"carlo",33));
        lista.add(new Persona(2,"Carlo",33));
        lista.add(new Persona(2,"Xarlo",33));
        lista.add(new Persona(2,"Karlo",33));
        
        for(Persona p:lista){
            System.out.println(p.getId()+"-"+p.getNombre());
        }
    }
    
}
