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
public class MiComparator implements Comparator {
    
    public int compare(Object o1, Object o2) {
        Persona2 p1= (Persona2)o1;
        Persona2 p2= (Persona2)o2;
        int c1=p1.getNombre().compareTo(p2.getNombre());
        int c2=p1.getApellido().compareTo(p2.getApellido());
        int result=0;
        if(c1!=0){
            result=c1;
        }else{
            if(c1==0){
                c2=result;
            }
        }
        return result;
    }
    
}
