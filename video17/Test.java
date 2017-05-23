/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video17;

import java.util.Stack;

/**
 *
 * @author kuuzou
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
		Stack<Persona> pila = new Stack<Persona>();
		pila.push(new Persona(4,"Carlo1",23));
		pila.push(new Persona(2,"Carlo2",23));
		pila.push(new Persona(2,"Carlo3",21));
		pila.push(new Persona(1,"Carlo4",21));
		
		for(Persona elemento : pila){
			System.out.println(elemento);
                }
                
                //ultimo    
                System.out.println("Tope " + pila.peek());
                
                //Removiendo
                while(!pila.isEmpty()){
			System.out.println("Atendiendo a " + pila.pop());
			Thread.sleep(1000);
}
    }
}
