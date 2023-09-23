package ar.edu.unahur.empresaTransporte;

abstract class Vehiculo {

	protected Integer cantdKmRecorridos = 0;
	protected Integer choferId;
	protected Boolean[] asientos = {Boolean.FALSE};
	protected String categoriaVehiculo;
	
	public Boolean[] getAsientos() {
		return this.asientos;
	}

	public Integer getChoferId() {
		return this.choferId;
	}

	public Integer getCantdKmRecorridos() {
		return this.cantdKmRecorridos;
	}

	public void asignarChoferPorId_(Chofer chofer) {
		if (this.noHayPasajeros() && this.choferId == null && chofer.getNombreCategoria()==this.categoriaVehiculo) {
			this.choferId = chofer.getId();
		}
	}
	
	public void asignarNuevoChoferPorId_(Chofer chofer) {
		if (this.noHayPasajeros() && chofer.getNombreCategoria()==this.categoriaVehiculo) {
			this.choferId = chofer.getId();
		}
	}

	public Boolean noHayPasajeros() {
		return this.ultimoAsientoNoOcupado() == 0;
	}
	
	protected Integer ultimoAsientoNoOcupado() {
		Integer asientoNro = 0;
		while (this.asientos[asientoNro] == Boolean.TRUE) {
			asientoNro++;
		}
		return asientoNro;
	}
	
	public Boolean sumarPasajero() {
		Boolean pasajeroAgregado = Boolean.FALSE;
		if (this.choferId!=null) {
			if (this.ultimoAsientoNoOcupado() <= this.asientos.length && 
					!this.asientos[this.ultimoAsientoNoOcupado()]) {
				this.asientos[this.ultimoAsientoNoOcupado()] = Boolean.TRUE;
				pasajeroAgregado = Boolean.TRUE;
			}
		}
		return pasajeroAgregado;
	}

	public void vaciarsientos() {
		for (Integer asiento = 0; asiento < this.asientos.length; asiento++) {
			this.asientos[asiento] = Boolean.FALSE;
		}
	}
	
	public void recorrer_Km(Integer kmARecorrer) {
		this.cantdKmRecorridos += kmARecorrer;
	}
}