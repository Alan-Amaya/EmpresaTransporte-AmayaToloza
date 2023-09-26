package ar.edu.unahur.empresaTransporte;

public class Autobus extends Vehiculo {
	
	public Autobus() {
		for (Integer asiento = 0; asiento < 20; asiento++) {
			this.asientos.add(Boolean.FALSE);
		}
		this.categoriaVehiculo = Categorias.getCategoria(3);
		Vehiculo.nroAsientos = 19;
	}
	
	public Boolean sumarPasajero() {
	Boolean pasajeroAgregado = Boolean.FALSE;
	if (this.hayAsientoLibreYHayChofer()) {
		this.asientos.add(this.asientoLibreNroX(), Boolean.TRUE);
		pasajeroAgregado = Boolean.TRUE;
		}
	return pasajeroAgregado;
	}
	
}
