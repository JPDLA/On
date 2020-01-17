package modelo;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public Vehiculo() {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	abstract public String formatoPrecio();
	
	abstract public String formato();
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() + " // " + "Modelo: "+ getModelo() + " // "+ "Precio: " + getPrecio();
	}
	
	
}
