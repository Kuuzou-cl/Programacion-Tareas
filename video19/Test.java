/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video19;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public static void main(String... ejercicioDeque) {

		Deque<String> dq = new ArrayDeque<>();
		dq.add("1-carlo");
		dq.add("2-Carlo");
		dq.add("3-kkkk");
		
		String x = dq.peek();
		System.out.println("Peek " + x);
		
		x = dq.poll();
		System.out.println("Poll " + x);
		x = dq.pop();
		System.out.println("Poop " + x);
		
                
                
		dq.addFirst("0-Agregado al pincipio");
		dq.addLast("4-Agregado al final");				
		
		
		for (String elemento : dq) {
			System.out.println(elemento);
		}
}
    
}
