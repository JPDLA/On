package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import controlador.Ifunciones;
import controlador.IordenarLista;

public class Lista implements Ifunciones, IordenarLista {

	private ArrayList<Vehiculo> listVehiculos;

	public Lista() {
		listVehiculos = new ArrayList<Vehiculo>();
	}

	public ArrayList<Vehiculo> getListVehiculos() {
		return listVehiculos;
	}

	public void setListVehiculos(Vehiculo vehiculo) {
		this.listVehiculos.add(vehiculo);
	}


	public void imprimir() {
	
		listVehiculos.stream().forEach((p)-> {		
		System.out.println(p.toString());
		});
		System.out.println("=============================");		
	}

	@Override
	public void menorValor() {
	
		Optional<Vehiculo> min = listVehiculos.stream().min(Comparator.comparingDouble(Vehiculo::getPrecio));
		System.out.println("Vehìculo màs barato: " + min.get().getMarca() + " " + min.get().getModelo());
	
	}

	@Override
	public void mayorValor() {

		Optional<Vehiculo> max = listVehiculos.stream().max(Comparator.comparingDouble(Vehiculo::getPrecio));
		System.out.println("Vehìculo màs caro: " + max.get().getMarca() + " " + max.get().getModelo());
		
	}

	@Override
	public void contiene(String o) {		
		
		String let = "Vehiculo que contiene en el modelo la letra '" + o.toUpperCase() + "': ";
		
		listVehiculos.stream().filter(i -> i.getModelo().contains(o.toUpperCase())).forEach(i -> System.out.println(let+" "+i.getMarca()+" "+ 
		i.getModelo()+" "+i.formatoPrecio()));
	}
	
	@Override
	public void ordenDecendente() {
		
		System.out.println("=============================");
		System.out.println("Vehículos ordenados por precios de mayor a menor: ");
		listVehiculos.stream().sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed()).collect(Collectors.toList()).forEach(i -> {
			System.out.println(i.getMarca() +" "+i.getModelo());
		});
		
	}

	@Override
	public void ordenAscendente() {

		System.out.println("=============================");		

		listVehiculos.stream().sorted(Comparator.comparingDouble(Vehiculo::getPrecio)).collect(Collectors.toList()).forEach(i -> {
			System.out.println(i.getMarca() +" "+i.getModelo() +" "+i.formatoPrecio());
		});
	}
	
}
