package ar.edu.unahur.empresaTransporte;

public class Moto extends Vehiculo {

	public Moto() {
		this.asientos.add( Boolean.FALSE);
		this.categoriaVehiculo = Categorias.getCategoria(1);
		Vehiculo.nroAsientos = 0;
	}
	
	public Boolean sumarPasajero() {
	Boolean pasajeroAgregado = Boolean.FALSE;
	if (this.hayAsientoLibre() && this.choferId!=null) {
		this.asientos.add(0, Boolean.TRUE);
		pasajeroAgregado = Boolean.TRUE;
		}
	return pasajeroAgregado;
	}
}