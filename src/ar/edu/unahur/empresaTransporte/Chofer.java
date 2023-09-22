package ar.edu.unahur.empresaTransporte;

public class Chofer {
	private Integer id;
	private String nombre;
	private String nombreCategoria; /* la categoría está relacionada al vehículo que conduce, así que hay 3 */

	public Integer getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getNombreCategoriaPorNroCat_(Integer nroCat) {
		this.nombreCategoria = Categorias.getCategoria(nroCat);
		return nombreCategoria;
	}

	public void asignarId(Integer id) {
		this.id = id;
	}

	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean asignarCategoria(Integer nroCategoria) {
		Boolean salida = Boolean.TRUE;
		if (1 <= nroCategoria && nroCategoria <= 3) {
			this.nombreCategoria = Categorias.getCategoria(nroCategoria);
		} else {
			salida = Boolean.FALSE;
		}
		return salida;
	}
}
