package com.java2;

public class Perro {
	
	String pelo, cola;
	static String orejas;
	
	public Perro (String varColorOrejas, String varColorPelo, String formaCola) {
		
		pelo = varColorPelo;
		cola = formaCola;
		orejas = varColorOrejas;
	}
	
	public static void deQueColorSonlasOrejas() {
		System.out.println("El color de las orejas son: "+orejas);
	}
	
	

}
