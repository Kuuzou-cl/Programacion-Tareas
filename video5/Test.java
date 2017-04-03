/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video5;

/**
 *
 * @author kuuzou
 */
public class Test {
    public static void main(String... progra){
        //PaisDAOImpl dao= new PaisDAOImpl();
        
        PaisDAOImpl dao= PaisDAOImpl.getInstance();
        for( Object obj :dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        
        for( Object obj :dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        PaisDAOImpl dao2= PaisDAOImpl.getInstance();
        for( Object obj :dao2.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
    }
}
