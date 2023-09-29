package com.zabalegui.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Hi My name is %s Im %d old and porcentaje of %.2f", "Alan", 29,  8.7);
		ArrayList<Integer> lista = null; 
		
		HashSet<Integer> set = new HashSet<Integer>();		
		Set newSet = set;
		set.add(2);
		
		
		LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>();
		newSet = linkSet;
		

		Perro perrito = new Perro();
		Perro tribilin = new Perro();
		
		perrito.setEdad(6);
		perrito.getEdad(); // edad: 6

	}

}
