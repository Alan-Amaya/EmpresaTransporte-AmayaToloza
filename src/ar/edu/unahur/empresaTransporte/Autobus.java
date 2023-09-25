package ar.edu.unahur.empresaTransporte;

public class Autobus extends Vehiculo {
	private Integer capacidaMaximaDePasajeros = 20;
	
	public Autobus() {
		//relleno todos los asientos con "Libre"
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
	}
	public Autobus(Chofer unChofer) {this.chofer = unChofer;}
}
