package ar.edu.unahur.empresaTransporte;

public class Automovil extends Vehiculo {

	public Automovil() {
		for (Integer asiento = 0; asiento < 3; asiento++) {
			this.asientos.add(Boolean.FALSE);
		}
		this.categoriaVehiculo = Categorias.getCategoria(2);
		Vehiculo.nroAsientos = 2;
	}

	public Boolean sumarPasajero(Integer nroPasajeros) {
		Boolean pasajeroAgregado = Boolean.FALSE;
		if (nroPasajeros-1 <= Vehiculo.nroAsientos && this.hayAsientoLibreYHayChofer()) {
			for (Integer asiento = 0; asiento < nroPasajeros; asiento++) {
				this.asientos.add(Boolean.TRUE);
			}
			pasajeroAgregado = Boolean.TRUE;
		}
		return pasajeroAgregado;
	}
	
}
