package VehiculosV1;

public class automoviles extends vehiculos {

	public automoviles(String choferAsignado, String copAsignado) {super(choferAsignado, copAsignado);}
	
	//en el caso del auto, tiene menos espacio
	private boolean hayEspacio() {return pasajeros.length < 3;}
	
	public void sumarPasajeros(Integer posicion, String Pasajero) {
		if(this.hayEspacio())	{pasajeros[posicion-1] = Pasajero;} 
	}
}
