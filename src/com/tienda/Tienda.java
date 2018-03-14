package com.tienda;

import java.util.ArrayList;

public class Tienda {
	private String nombre;
	private ArrayList<Articulo> articulos;

	public Tienda() {
	}

	public Tienda(String nombre, ArrayList<Articulo> articulos) {
		this.nombre    = nombre;
		this.articulos = articulos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	public void vender(ArrayList<Articulo> articulos) {
		
		for(Articulo art : articulos) {
			//art.descontar();
		}
	}
}
