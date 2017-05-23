/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video20;

/**
 *
 * @author kuuzou
 */
public class Test {
    public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Linea1");
		//sb.append("MitoCode").append(" Linea2");
		
		//System.out.println(sb.toString());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		sb.setLength(0);
		System.out.println(sb.toString());
		
}
    
}
