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
class Clase<T,K,V,E> {
    private T objetoT;
    private K objetoK;
    private V objetoV;
    private E objetoE;

    public Clase(T objetoT, K objetoK, V objetoV, E objetoE) {
        this.objetoT = objetoT;
        this.objetoK = objetoK;
        this.objetoV = objetoV;
        this.objetoE = objetoE;
    }


    
    public void mostrarTipo(){
        System.out.println("Este objeto es de tipo: "+objetoT.getClass().getName());
        System.out.println("Este objeto es de tipo: "+objetoK.getClass().getName());
        System.out.println("Este objeto es de tipo: "+objetoV.getClass().getName());
        System.out.println("Este objeto es de tipo: "+objetoE.getClass().getName());
    }
}
