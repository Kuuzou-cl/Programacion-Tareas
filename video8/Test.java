/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public void listarUppB(List<? extends Persona> lista){
        for (Persona a : lista){
            System.out.println(a.getNombre());
        }   
    }
    
    public void listarLowB(List<? super Alumno> lista){
        for (Object a : lista){
            System.out.println(((Alumno)a).getNombre());
        }
        
    }
    
    public void listarUnB(List<?> lista){
        for (Object a : lista){
            if(a instanceof Alumno){
                System.out.println(((Alumno)a).getNombre());
            }else{
                if(a instanceof Profesor){
                    System.out.println(((Profesor)a).getNombre());
                }
            }  
        }
        
    }
    
    public static void main(String [] args){
        Test test= new Test();
        
        Alumno al1=new Alumno("Carlo");
        Alumno al2=new Alumno("Carlo2");
        Alumno al3=new Alumno("Carlo3");
        Alumno al4=new Alumno("Carlo4");
        Profesor pr1=new Profesor("Profe1");
        Profesor pr2=new Profesor("Profe2");
        
        List<Persona> lista=new ArrayList<>();
        
        lista.add(al1);
        lista.add(al2);
        lista.add(al3);
        lista.add(al4);
        lista.add(pr1);
        lista.add(pr2);
        
        test.listarUppB(lista);
        test.listarLowB(lista);
        test.listarUnB(lista);
        
    }
    
    
    
}
