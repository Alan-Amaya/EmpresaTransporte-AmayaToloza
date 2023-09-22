package ar.edu.unahur.empresaTransporte;

abstract class Vehiculo {

	protected Integer cantdKmRecorridos = 0;
	protected Integer choferId;
	protected Boolean[] asientos;

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
		if (this.noHayPasajeros()) {
			this.choferId = chofer.getId();
		}
	}

	private Boolean noHayPasajeros() {
		Integer asientosVacios = 0;
		Boolean todosAsientosVacios = Boolean.FALSE;
		for (Integer asiento = 0; asiento < this.asientos.length; asiento++) {
			if (this.asientos[asiento] == Boolean.FALSE) {
				asientosVacios++;
			}
		}
		if (asientosVacios == this.asientos.length) {
			todosAsientosVacios = Boolean.TRUE;
		}
		return todosAsientosVacios;
	}

	public Boolean sumarPasajero() {
		Integer asientoNro = 0;
		Boolean pasajeroAgregado = Boolean.FALSE;
		while (asientos[asientoNro] == Boolean.TRUE) {
			asientoNro++;
		}
		if (asientoNro <= this.asientos.length && asientos[asientoNro] == Boolean.FALSE) {
			asientos[asientoNro] = Boolean.TRUE;
			pasajeroAgregado = Boolean.TRUE;
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