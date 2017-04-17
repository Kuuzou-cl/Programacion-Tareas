/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video12;


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
        
        Collections.sort(lista);
        
       /* for(Persona n:lista){
            System.out.println(n.getNombre());
        }*/
        
        //Ejemplo
        
        List<Persona2> ejemplo= new ArrayList<>();
        ejemplo.add(new Persona2(1,"Bernucci","Carlo",22));
        ejemplo.add(new Persona2(1,"Cernucci","Carlo",22));
        ejemplo.add(new Persona2(1,"Aernucci","Carlo",22));
        
        for(Persona2 n:ejemplo){
            System.out.println(n.getNombre()+" "+n.getApellido());
        }
    }
    
}
