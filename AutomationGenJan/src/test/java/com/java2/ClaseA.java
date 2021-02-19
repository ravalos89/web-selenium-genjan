package com.java2;

import com.java.Array;

public class ClaseA extends Array{
	public static void main(String[] args) {
		
	Array array = new Array();
	int x= array.suma(1,2,3);
	System.out.println(x);
	
	Perro objPerro = new Perro("Amarillo", "Amarillo", "Corta");
	objPerro.deQueColorSonlasOrejas();
		
	}
}
