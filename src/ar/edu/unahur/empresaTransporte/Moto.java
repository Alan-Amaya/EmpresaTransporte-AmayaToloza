package ar.edu.unahur.empresaTransporte;

public class Moto extends Vehiculo {

	public Moto() {
		this.asientos[0] = "vacio";
		this.categoriaVehiculo = Categorias.getCategoria(1);
	}
}