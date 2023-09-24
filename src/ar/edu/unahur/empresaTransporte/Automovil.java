package ar.edu.unahur.empresaTransporte;

public class Automovil extends Vehiculo {

	public Automovil() {
		this.asientos = new Boolean [3];
		for (Integer asiento = 0; asiento < 3; asiento++) {
			this.asientos[asiento] = Boolean.FALSE;
		}
		this.categoriaVehiculo = Categorias.getCategoria(2);
	}

}
