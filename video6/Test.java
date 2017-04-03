/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video6;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public static void main(String [] args){
        Clase<String> c=new Clase("Esto es un String");
        Clase<Integer> n=new Clase(23);
        
        c.mostrarTipo();
        n.mostrarTipo();
    }
}
