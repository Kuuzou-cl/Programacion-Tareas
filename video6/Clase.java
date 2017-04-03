/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video6;

/**
 *
 * @author kuuzou
 */
class Clase<T> {
    private T objeto;

    public Clase(T objeto) {
        this.objeto = objeto;
    }
    
    public void mostrarTipo(){
        System.out.println("Este objeto es de tipo: "+objeto.getClass().getName());
    }
}
