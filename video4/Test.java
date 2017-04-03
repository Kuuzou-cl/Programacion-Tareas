/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    
    private void verificar(Object objeto){
        if (objeto instanceof Fruta){
            System.out.println("Agregado");
        }else{
            System.out.println("No agregado");
        }
    }
    
    public static void main(String [] args){
        String txt= new String("Hola hola");
        if(txt instanceof String){
            System.out.println("FUNCIONA!");
        }
        Alumno alum=new Alumno();
        if(alum instanceof Alumno){
            System.out.println("Es un alumno");
        }
        if(alum instanceof Persona){
            System.out.println("Es una persona");
        }
        
        Manzana f1=new Manzana("Manzana");
        Naranja f2=new Naranja("Naranja");
        Lechuga n3=new Lechuga("Lechuga");
        Test test=new Test();
        test.verificar(f1);
        test.verificar(f2);
        test.verificar(n3);
    }
    
}
