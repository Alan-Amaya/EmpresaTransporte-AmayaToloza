package ar.edu.unahur.empresaTransporte;

public class Chofer {
	protected Integer id;
	private String nombre;
	private Integer nroCategoria = 0; /* la categor�a est� relacionada al veh�culo que conduce, as� que hay 3 */
	
	public Chofer(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Integer getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}

	public String getNombreCategoria() {
		return Categorias.getCategoria(this.nroCategoria);
	}

	public void asignarNroCategoria(Integer nroCategoria) {
		if (1 <= nroCategoria && nroCategoria <= 3) {
			this.nroCategoria = nroCategoria; 
		}
	}
}
