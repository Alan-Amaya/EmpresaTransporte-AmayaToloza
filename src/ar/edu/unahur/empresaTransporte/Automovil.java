package ar.edu.unahur.empresaTransporte;

public class Automovil extends Vehiculo {
private Integer capacidaMaximaDePasajeros = 3;
private Chofer conductor;
private Chofer copiloto;
	
	public Automovil() {
		//relleno todos los asientos con "Libre"
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
	}
	
	public Automovil(Chofer conductor, Chofer copiloto) {
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
		
		this.conductor = conductor;
		this.copiloto = copiloto;
	}
}

