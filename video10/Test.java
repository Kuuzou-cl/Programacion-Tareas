/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 *
 * @author kuuzou
 */
public class Test {
    
    Random rnd= new Random();
    
    public static void main(String [] args){
        List<String> lista= new ArrayList<>();
        lista.add("Carlo");
        lista.add("karlo");
        lista.add("Qarlo");
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
        /*Ejemplo*/
        Test test= new Test();
        
        List<Integer> ejemplo= new ArrayList<>();
        test.llenado(ejemplo);
        Collections.sort(ejemplo);
        System.out.println(ejemplo);
        
    }
    
    public  void llenado(List ejemplo){
        for(int i=0;i<15;i++){
            int random=(int) (rnd.nextDouble() * 40 + 1);
            ejemplo.add(i, random);
        }
        System.out.println(ejemplo);
    }
    
}
