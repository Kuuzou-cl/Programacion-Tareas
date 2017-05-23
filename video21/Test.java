/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video21;

/**
 *
 * @author kuuzou
 */
public class Test {
    public static void main(String... ejercicio21) {
        String cadena = "Palabra1|Palabra2|Palabra3|Palabra4";
        String[] extraccion = cadena.split("\\|", 5);

        for (String elemento : extraccion) {
            System.out.println(elemento);
        }
    }
}
