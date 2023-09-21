package VehiculosV1;

public class Autobuses extends vehiculos {
	
	@Override //override es para sobrecribir un metodo de la clase padre
	
	public void sumarPasajeros(Integer posicion, String Pasajero) {
		if(this.hayEspacio())	{pasajeros[posicion-1] = Pasajero;} 
	}
	
	
	//se fija si el array de pasajeros no superó los 20 pasajeros
	private boolean hayEspacio() {return pasajeros.length < 20;}
	

	//Mismo constructor que la clase padre
	public Autobuses(String choferAsignado, String copAsignado) {
		super(choferAsignado, copAsignado);
	}
	
}
	