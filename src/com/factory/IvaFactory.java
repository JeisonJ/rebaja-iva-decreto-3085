package com.factory;

import com.interfaces.TipoIva;

public class IvaFactory {
	private static final double RANGO = 2000000.00; 
	
	public static TipoIva getInstance(double d) {
		
		if(d > RANGO) {
			
			// Cuando el monto  sea superior  a 2.000.000.00 el porcentaje 
			// del IVA es el 7%
			return TipoIva::IVASiete;
			
		} else if(d <= RANGO) {
			
			// Cuando el monto sea hasta 2.000.000.00 el  porcentaje del IVA es el 9%
			return TipoIva::IVANueve;
			
		} else {
			
			// Queda excluido de esta rebaja cuando  las operaciones sean pagadas a 
			// trav�s de medios no electr�nicos; sea el pago con cheque de Gerencia o 
			// en   efectivo se aplicara la al�cuota  general impositiva prevista en 
			// el art�culo 62 del Decreto con rango y valor que establece el Impuesto 
			// del Valor agregado  del 12% del IVA.
			return TipoIva::IVANormal;
		}
	}
}
