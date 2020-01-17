package vista;

import controlador.Auto;
import modelo.Lista;
import modelo.Moto;
import modelo.Vehiculo;

public class Test {

	public static void main(String[] args) {
				
		Lista l = new Lista();
		
		Vehiculo v1 = new Auto("Peugeot", "206", 200000.00, 4);
		Auto v2 = new Auto(); 
		v2.setMarca("Peugeot");
		v2.setModelo("208");
		v2.setPuertas(5);
		v2.setPrecio(250000);
	
		Moto v3 = new Moto("Honda", "Titan", 60000, 125);
		Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50, 160);
				
		l.setListVehiculos(v1);
		l.setListVehiculos(v2);
		l.setListVehiculos(v3);
		l.setListVehiculos(v4);
		
		l.imprimir();
		l.mayorValor();
		l.menorValor();
		l.contiene("Y");
		
		l.ordenDecendente();
//		l.ordenAscendente();
		
	}
}
