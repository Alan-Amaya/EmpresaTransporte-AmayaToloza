package ar.edu.unahur.empresaTransporte;

abstract class Vehiculo {

	protected Integer cantdKmRecorridos = 0;
	protected Integer choferId;
	protected Boolean[] asientos;

	public Boolean[] getAsientos() {
		this.cantdKmRecorridos += 1;
		return this.asientos;
	}

	public Integer getChoferId() {
		this.cantdKmRecorridos += 1;
		return this.choferId;
	}

	public Integer getCantdKmRecorridos() {
		this.cantdKmRecorridos += 1;
		return this.cantdKmRecorridos;
	}

	public void asignarChoferPorId_(Chofer chofer) {
		this.cantdKmRecorridos += 1;
		if (this.noHayPasajeros()) {
			this.choferId = chofer.getId();
		}
	}

	private Boolean noHayPasajeros() {
		this.cantdKmRecorridos += 1;
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
		this.cantdKmRecorridos += 1;
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
		this.cantdKmRecorridos += 1;
		for (Integer asiento = 0; asiento < this.asientos.length; asiento++) {
			this.asientos[asiento] = Boolean.FALSE;
		}
	}
}