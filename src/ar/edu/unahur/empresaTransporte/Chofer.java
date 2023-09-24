package ar.edu.unahur.empresaTransporte;

public class Chofer {
	private Integer id;
	private String nombre;
	private Integer nroCategoria;
	
	public Chofer(Integer id, String nombre, Integer categoria) {
		this.id = id;
		this.nombre = nombre;
		this.asignarNroCategoria(categoria);
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

	private void asignarNroCategoria(Integer nroCategoria) {
		if (1 <= nroCategoria && nroCategoria <= 3) {
			this.nroCategoria = nroCategoria;
		}
	}
}
