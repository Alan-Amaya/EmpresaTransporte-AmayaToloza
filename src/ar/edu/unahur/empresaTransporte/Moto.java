package ar.edu.unahur.empresaTransporte;

public class Moto extends Vehiculo {

	public Moto() {
		this.asientos = new Boolean [0];
		this.asientos[0] = Boolean.FALSE;
		this.categoriaVehiculo = Categorias.getCategoria(1);
	}
}