package ar.edu.unahur.empresaTransporte;

public class Moto extends Vehiculo {
private Integer capacidaMaximaDePasajeros = 1;
	public Moto() {
		//relleno todos los asientos con "Libre"
		for(int cantAsientos = 0; cantAsientos<capacidaMaximaDePasajeros; cantAsientos++) 
		{ asientos.add(cantAsientos, "Libre");}
	}
}
