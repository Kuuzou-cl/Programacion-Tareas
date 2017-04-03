/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kuuzou
 */
public class PaisDAOImpl {
    
    public static PaisDAOImpl instancia=null;
    
    public static PaisDAOImpl getInstance(){
        if(instancia==null){
            instancia=new PaisDAOImpl();
        }
        return instancia;
    }
    
    private List paises=null;
    
    public List getPaises(){
        paises=new ArrayList();
        Pais p1=new Pais("Chile");
        paises.add(p1);
        Pais p2=new Pais("Peru");
        paises.add(p2);
        return paises;
    }
    
}
