package VehiculosV1;

//La clase es abstracta para que creen este vehiculo
abstract class vehiculos {
	
	private Integer cantKmRecorridos = 0; //ignora la advertencia XD
	protected String chofer = "unChofer"; //acá igual lo mejor sería que sea una clase de persona->chofer pero lo puse asi por rapidez
	protected String copiloto = "unCop";
	protected String[] pasajeros;
	
	//Comprueba si cumple con la condición de que no hayan pasajeros para cambiar de chofer
	public void asignarNuevoChofer( String choferNuevo) { if (this.noHayPasajeros()) {this.chofer = choferNuevo;} }
	public void asignarNuevoCop( String copNuevo) { if (this.noHayPasajeros()) {this.copiloto = copNuevo;} }
	
	//La idea es que compruebe si la lista de pasajeros está vacía, no sé si está bien así o si hay mejores formas de escribirlo
	private Boolean noHayPasajeros() {return this.pasajeros.length == 0;}
	
	
	//Pido la posicion que le corresponde al pasajero para saber en donde ponerlo y pidoa quién poner
	public void sumarPasajeros(Integer posicion, String Pasajero) {
		//Le resto uno porque en una matriz, el primer elemento es cero
		pasajeros[posicion-1] = Pasajero; 
	}
	
	//creo un constructor por si quiero inicializar un vehiculo nuevo ya con un chofer y un copiloto
	public vehiculos(String choferAsignado, String copAsignado) { chofer = choferAsignado; copiloto = copAsignado;}
}

