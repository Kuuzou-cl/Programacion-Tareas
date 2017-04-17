/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public static void main(String [] args){
        List<Persona> lista= new ArrayList<>();
        lista.add(new Persona(1,"Karlo",22));
        lista.add(new Persona(2,"Carlo",39));
        lista.add(new Persona(3,"Qarlo",4));
        
        Collections.sort(lista,new NombreComparator());
        
        //for(Persona i:lista){
        //    System.out.println(i.getNombre());
        //}
        /*Ejemplo*/
        
        List<Persona2> ejemplo= new ArrayList<>();
        ejemplo.add(new Persona2(1,"Bernucci","Carlo",22));
        ejemplo.add(new Persona2(1,"Cernucci","Carlo",22));
        ejemplo.add(new Persona2(1,"Aernucci","Carlo",22));
        
        Collections.sort(ejemplo, new MiComparator());
        
        for(Persona2 i:ejemplo){
            System.out.println(i.getApellido());
        }
    }
    
}
