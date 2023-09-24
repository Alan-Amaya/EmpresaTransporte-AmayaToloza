package ar.edu.unahur.empresaTransporte;

public class Autobus extends Vehiculo {
	
	public Autobus() {
		this.asientos = new Boolean [20];
		for (Integer asiento = 0; asiento < 20; asiento++) {
			this.asientos[asiento] = Boolean.FALSE;
		}
		this.categoriaVehiculo = Categorias.getCategoria(3);
	}
}
