package com.tienda;

public class Articulo {
	private String nombre;
	private double precio;
	private int    inStock;

	public Articulo() {
	}

	public Articulo(String nombre, double precio, int inStock) {
		this.nombre  = nombre;
		this.precio  = precio;
		this.inStock = inStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return inStock;
	}

	public void setStock(int inStock) {
		this.inStock = inStock;
	}
	
	public void descontar(int cantidad) {
		this.inStock -= cantidad; 
	}

	@Override
	public String toString() {
		return this.getNombre() + "  ---  " + this.getPrecio();
	}
	
}
