package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.pojo.Factura;
import com.tienda.Articulo;

public class main {

	public static void main(String[] args) {
		
		// Articulos a comprar.
		Articulo fresa   = new Articulo("Fresas con crema 900gr", 6800000.0, 87);
		Articulo manzana = new Articulo("Manzana 1ud.          ", 14.0, 85);
		Articulo pera    = new Articulo("Peras Mama mia Kgr    ", 21.0, 5);
		Articulo yogurt  = new Articulo("Yogurt natural 900gr  ", 40.0, 10);
		
		List<Articulo> articulos = Arrays.asList(fresa, manzana, pera, yogurt);
		
		// Realizar factura.
		Factura factura = new Factura(001, articulos);
		factura.imprimirFactura();
	}

}
