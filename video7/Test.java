/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public static void main(String [] args){
        
        Clase<String,Integer,String,Double> c=new Clase<>("test",2,"Hola",3.2);
        c.mostrarTipo();
        List<Clase<String,Integer,String,Double>> lista= new ArrayList();
        lista.add(new Clase<String,Integer,String,Double>("test2",3,"Hey",5.3));
        
        for(Clase<String,Integer,String,Double> cl: lista){
            cl.mostrarTipo();
        }
    }
}
