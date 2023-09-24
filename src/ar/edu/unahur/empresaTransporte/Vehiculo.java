package ar.edu.unahur.empresaTransporte;

abstract class Vehiculo {

	protected Integer cantdKmRecorridos = 0;
	protected Integer choferId;
	protected Boolean[] asientos;
	protected String categoriaVehiculo;
	
	public String getCategoria() {
		return this.categoriaVehiculo;
	}
	public Integer getChoferId() {
		return this.choferId;
	}

	public Integer getCantdKmRecorridos() {
		return this.cantdKmRecorridos;
	}
	
	public Boolean[] getAsientos() {
		return this.asientos;
	}
	
	public Integer asientoLibreNroX() {
		Integer asientoNro = 0;
		while (this.asientos[asientoNro]) {
			asientoNro++;
		}
		return asientoNro;
	}
	
	public Boolean noHayPasajeros() {
		return this.asientoLibreNroX() == 0;
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
	
	protected Boolean hayAsientoLibre() {
		return this.asientoLibreNroX() != this.asientos.length-1;
	}
	
	public Boolean sumarPasajero() {
		Boolean pasajeroAgregado = Boolean.FALSE;
		if (this.choferId!=null) {
			if (this.hayAsientoLibre()) {
				this.asientos[this.asientoLibreNroX()] = Boolean.TRUE;
				pasajeroAgregado = Boolean.TRUE;
			}
		}
		return pasajeroAgregado;
	}
	
	public void vaciarAsientos() {
		for (Integer asiento = 0; asiento < this.asientos.length; asiento++) {
			this.asientos[asiento] = Boolean.FALSE;
		}
	}
	
	public void recorrer_Km(Integer kmARecorrer) {
		this.cantdKmRecorridos += kmARecorrer;
	}

}