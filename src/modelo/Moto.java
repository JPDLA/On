package modelo;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

	private int cilindrada;
	
	public Moto(String marca, String modelo, double precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	public Moto() {
		super();
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String formatoPrecio() {

		DecimalFormat df = new DecimalFormat("$###,###.00");
		
		return df.format(getPrecio());
	}

	@Override
	public String formato() {
		double cilindro = (double) getCilindrada(); 
		DecimalFormat df = new DecimalFormat("000c");
		
		return df.format(cilindro);
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // " + "Modelo: "+ getModelo() + " // "+ "Cilindrada: "+ formato() + " // "+ "Precio: " + formatoPrecio();
	}

}
