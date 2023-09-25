package ar.edu.unahur.empresaTransporte;

public class Moto extends Vehiculo {
private Integer capacidaMaximaDePasajeros = 1;
private Chofer conductor;
private Chofer copiloto;
	
	public Moto() {
		//relleno todos los asientos con "Libre"
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
	}
	
	public Moto(Chofer conductor, Chofer copiloto) {
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
		
		this.conductor = conductor;
		this.copiloto = copiloto;
	}
}

