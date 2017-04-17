/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video11;

import java.util.Comparator;

/**
 *
 * @author kuuzou
 */
public class NombreComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Persona p1= (Persona)o1;
        Persona p2= (Persona)o2;
        
        return(p1.getNombre().compareTo(p2.getNombre()));
    }
    
}
