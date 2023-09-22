package ar.edu.unahur.empresaTransporte;

public class Automovil extends Vehiculo {

	public Automovil() {
		for (Integer asiento = 0; asiento < 3; asiento++) {
			this.asientos[asiento] = Boolean.FALSE;
		}
	}

	@Override
	public void asignarChoferPorId_(Chofer chofer) {
		this.cantdKmRecorridos += 1;
		this.choferId = chofer.getId();
	}
}
