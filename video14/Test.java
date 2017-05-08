/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video14;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author kuuzou
 */
public class Test {

    public static void main(String[] args) {
        Set<Persona> lista = new TreeSet<>();
        lista.add(new Persona(1, "Carlo", 22));
        lista.add(new Persona(2, "carlo", 23));
        lista.add(new Persona(3, "Carlo", 24));
        lista.add(new Persona(3, "Karlo", 24));
        lista.add(new Persona(6, "Qarlo", 27));

        for (Persona per : lista) {
            System.out.println(per.getId() + "-" + per.getNombre() + "-" + per.getEdad());
        }
    }
}
