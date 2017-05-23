/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video18;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author kuuzou
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Queue<Persona> cola = new PriorityQueue<>();
        cola.offer(new Persona(1, "Carlo1", 28));
        cola.offer(new Persona(2, "Carlo2", 27));
        cola.offer(new Persona(3, "Carlo3", 25));
        cola.offer(new Persona(4, "Krlo4", 26));

        while (!cola.isEmpty()) {

            // Sin borrar
            //System.out.println("Se procede a atender a " + cola.peek());
            
            //Borrando de la cola
            System.out.println("Atendiendo a " + cola.poll());
            Thread.sleep(1000);
        }
    }
}
