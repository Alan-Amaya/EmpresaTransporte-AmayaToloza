package VehiculosV1;

public class motos extends vehiculos{
	//Constructor
	public motos(String choferAsignado, String copAsignado) {super(choferAsignado, copAsignado);}

	@Override
	//en el caso de la moto debe asegurarse de que no haya copiloto para cambiar de chofer
	public void asignarNuevoChofer( String choferNuevo) { if (copiloto.isEmpty()) {this.chofer = choferNuevo;} }
	
}
