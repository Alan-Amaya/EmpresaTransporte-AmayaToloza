package ar.edu.unahur.empresaTransporte;

import java.util.*;

abstract class Vehiculo {

	protected Integer cantdKmRecorridos = 0;
	protected List<String> asientos = new ArrayList<>();
	protected String categoriaVehiculo;
	protected Chofer chofer;
	
	public List<String> getAsientos() {return this.asientos;}
	public Integer getCantdKmRecorridos() {return this.cantdKmRecorridos;}
	public String getCategoría() {return this.categoriaVehiculo;}

	public void asignarChoferConId_(Chofer chofer) {
		if (this.vehiculoVacio() && this.choferConCateriaCorrespondiente(chofer))
		{this.chofer = chofer;}
	}
	
	public void asignarNuevoChoferPorId_(Chofer chofer) {
		if (this.vehiculoVacio() && this.choferConCateriaCorrespondiente(chofer))
		{this.chofer = chofer;}
	}

	public boolean choferConCateriaCorrespondiente(Chofer chofer)
	{return chofer.getNombreCategoria()==this.categoriaVehiculo;}
	
	public Boolean sumarPasajero() {
		if(!this.vehiculoLleno()) 
		{asientos.set(this.primerAsientoLibre(),"Ocupado"); return Boolean.TRUE;}
		else return Boolean.FALSE;}
	

	public void recorrer_Km(Integer kmARecorrer) {this.cantdKmRecorridos += kmARecorrer;}
	
	public void vaciarAsientos() {
		Integer asiento = 0;
		while (!this.vehiculoVacio()){
			asientos.set(asiento, "Libre"); asiento++;}
	}
	
	
	public Integer primerAsientoLibre() {
	Integer nroAsientoLibre = 0;
	Integer asientoActual = 0;
	
		while (this.asientos.get(asientoActual) != "Libre") {
			if (this.asientos.get(asientoActual) == "Libre") 
				{nroAsientoLibre = asientoActual;}
			asientoActual++;
		}
		if (this.asientos.get(asientoActual) == "Libre") 
		{nroAsientoLibre = asientoActual;}
	return nroAsientoLibre;
	}
	
	public Boolean vehiculoVacio() {return !asientos.contains("Ocupado");}
	public Boolean vehiculoLleno() {return !asientos.contains("Libre");}
}