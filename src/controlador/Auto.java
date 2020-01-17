package controlador;

import java.text.DecimalFormat;

import modelo.Vehiculo;

public class Auto extends Vehiculo {

	private int puertas;
	
	public Auto(String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public Auto() {
		super();
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String formatoPrecio() {
		
		DecimalFormat df = new DecimalFormat("$###,###.00");
		return df.format(getPrecio());
	}
	
 	
	public String formato() {
		return null;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // " + "Modelo: "+ getModelo() + " // "+ "Puertas: "+ getPuertas() + " // "+ "Precio: " + formatoPrecio();
	}

	

}
