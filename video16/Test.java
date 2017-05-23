/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.video16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author kuuzou
 */
public class Test {
    
    public static void main(String[] args) {

		Map<Persona, String> map = new HashMap<>();
		map.put(new Persona(1,"MitoCode",21), "MitoCode");
		map.put(new Persona(2,"MitoCode",22), "Mito");
		map.put(new Persona(2,"MitoCode",22), "Mito");
		map.put(new Persona(2,"MitoCode",22), "Mito");
		map.put(new Persona(3,"MitoCode",24), "AAA");
		map.put(new Persona(6,"MitoCode",26), null);
                
                /*
                Map<String, String> map = new TreeMap<>();
		map.put("1", "QQ");
		map.put("2", "Hola");
		map.put("3", "Karlo");
		map.put("7", "carlo");
		map.put("5", "Carlo");
		map.put("4", null);
                */ 
                
                /*
                Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "QQ");
		map.put("2", "Hola");
		map.put("3", "Karlo");
		map.put("7", "carlo");
		map.put("5", "Carlo");
		map.put("4", null);
                */
                
		/*
                Iterator it = map.keySet().iterator();
		while(it.hasNext()){
		  Persona key = (Persona) it.next();
		  System.out.println("Clave: " + key + " ---> Valor: " + map.get(key));
		}
                */
		
		for(Entry<Persona, String> ent : map.entrySet()){
			System.out.println("Clave: " + ent.getKey()+ " -> Valor: " + ent.getValue());
		}
}
    
}
