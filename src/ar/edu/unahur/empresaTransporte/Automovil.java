package ar.edu.unahur.empresaTransporte;

public class Automovil extends Vehiculo {

	public Automovil() {
		for (Integer asiento = 0; asiento < 3; asiento++) {
			this.asientos[asiento] = "vacio";
		}
		this.categoriaVehiculo = Categorias.getCategoria(2);
	}

}
