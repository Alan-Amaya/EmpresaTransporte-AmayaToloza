package ar.edu.unahur.empresaTransporte;

import java.util.ArrayList;

abstract class Vehiculo {

	protected Integer cantdKmRecorridos = 0;
	protected Integer choferId;
	protected ArrayList<Boolean> asientos = new ArrayList<Boolean>();
	protected String categoriaVehiculo;
	protected static Integer nroAsientos;
	
	public String getCategoria() {
		return this.categoriaVehiculo;
	}
	
	public Integer getChoferId() {
		return this.choferId;
	}

	public Integer getCantdKmRecorridos() {
		return this.cantdKmRecorridos;
	}
	
	//Deberia ser borrado
	public ArrayList<Boolean> getAsientos() {
		return this.asientos;
	}
	
	public Integer asientoLibreNroX() {
		return this.asientos.indexOf(Boolean.FALSE);
	}
	
	public Boolean noHayPasajeros() {
		return !this.asientos.contains(Boolean.TRUE);
	}
	
	protected Boolean hayAsientoLibreYHayChofer() { 
		return this.hayAsientoLibre() && this.choferId!=null;
	}
	
	protected Boolean noHayPasajeroNiChoferYCoincideCategoria(Chofer chofer) {
		return this.noHayPasajeros() && this.choferId == null 
				&& chofer.getNombreCategoria()==this.categoriaVehiculo;
	}
	
	public Boolean asignarChofer(Chofer chofer) {
		Boolean asignadoCorrectamente = Boolean.FALSE;
		if (noHayPasajeroNiChoferYCoincideCategoria(chofer)) {
			this.choferId = chofer.getId();
			asignadoCorrectamente = Boolean.TRUE;
		}
		return asignadoCorrectamente;
	}

	public Boolean asignarNuevoChofer(Chofer chofer) {
		Boolean asignadoCorrectamente = Boolean.FALSE;
		if (this.noHayPasajeros() && chofer.getNombreCategoria()==this.categoriaVehiculo) {
			this.choferId = chofer.getId();
			asignadoCorrectamente = Boolean.TRUE;
		}
		return asignadoCorrectamente;
	}
	
	public Boolean hayAsientoLibre() {
		return this.asientoLibreNroX() <= Vehiculo.nroAsientos;
	}

	public void vaciarAsientos() {
		for (Integer asiento = 0; asiento <= Vehiculo.nroAsientos; asiento++) {
			this.asientos.add(asiento, Boolean.FALSE);
		}
	}
	
	public void recorrer_Km(Integer kmARecorrer) {
		this.cantdKmRecorridos += kmARecorrer;
	}

}