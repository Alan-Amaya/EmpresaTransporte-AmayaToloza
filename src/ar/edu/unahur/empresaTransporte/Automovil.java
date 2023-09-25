package ar.edu.unahur.empresaTransporte;

public class Automovil extends Vehiculo {
private Integer capacidaMaximaDePasajeros = 3;
	
	public Automovil() {
		//relleno todos los asientos con "Libre"
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
	}
}

