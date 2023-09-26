package ar.edu.unahur.empresaTransporte;

public class Moto extends Vehiculo {
	public Chofer copiloto; 
	
	public Moto() {
		this.asientos.add( Boolean.FALSE);
		this.categoriaVehiculo = Categorias.getCategoria(1);
		Vehiculo.nroAsientos = 0;
	}
	
	public Moto(Chofer cop) {
		this.asientos.add( Boolean.FALSE);
		this.categoriaVehiculo = Categorias.getCategoria(1);
		Vehiculo.nroAsientos = 0;
		
		this.copiloto = cop;
	}
	
	public Boolean sumarPasajero() {
	Boolean pasajeroAgregado = Boolean.FALSE;
	if (this.hayAsientoLibreYHayChofer()) {
		this.asientos.add(0, Boolean.TRUE);
		pasajeroAgregado = Boolean.TRUE;
		}
	return pasajeroAgregado;
	}
}