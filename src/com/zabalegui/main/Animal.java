package com.zabalegui.main;

public abstract class Animal {
	
	int edad = 10;
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	private int suma() {
		return this.edad + 20;
	}
	
	
	protected  int resta() {
		return this.edad - 20;
	}
	
		
}
