/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video12;


/**
 *
 * @author kuuzou
 */
public class Persona2 implements Comparable<Persona2> {
    private int id;
    private String apellido;
    private String nombre;
    private int edad;

    public Persona2(int id, String apellido, String nombre, int edad) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona2 o) {
        int c1=o.getNombre().compareTo(this.nombre);
        int c2=o.getApellido().compareTo(this.apellido);
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
