package com.pojo;

import java.util.ArrayList;
import java.util.List;

import com.factory.IvaFactory;
import com.interfaces.TipoIva;
import com.tienda.Articulo;

public class Factura {
	private int numero;
	private double importe;
	private List<Articulo> articulos;

	public Factura(int numero, List<Articulo> articulos) {
		this.numero = numero;
		// this.importe = importe;
		this.articulos = articulos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	public double getImporte(TipoIva tipo) {
		return tipo.calcular(this.subTotal());
	}

	public double subTotal() {
		return this.getArticulos()
				.stream()
				.mapToDouble(art -> art.getPrecio())
				.sum();
	}

	@Override
	public String toString() {
		return "Factura nro: " + this.getNumero() + " Articulos=" + articulos;
	}

	public void imprimirFactura() {
		System.out.println();
		System.out.println("Factura nro: " + this.getNumero() + "\n");
		System.out.println("------------------------- \n");
		System.out.println("Articulo                     Precio");
		// Articulo fresa = "Fresas con crema 900gr --- ",
		this.getArticulos().forEach(System.out::println);
		System.out.println("\nSubtotal:                    " + this.subTotal());
		double iva = getImporte(IvaFactory.getInstance(this.subTotal()));
		System.out.println("IVA:                         " + iva);
		System.out.println("Total:                       " + (this.subTotal() + iva));
	}

}
