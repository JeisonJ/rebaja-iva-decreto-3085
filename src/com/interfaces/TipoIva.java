package com.interfaces;

public interface TipoIva {
	
	public double calcular(double importe);
	
	public static double IVANormal(double importe) {
		return importe * 0.12;
	}
	
	public static double IVANueve(double importe) {
		return importe * 0.09;
	}
	
	public static double IVASiete(double importe) {
		return importe * 0.07;
	}
}
