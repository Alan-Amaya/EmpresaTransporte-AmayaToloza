package ar.edu.unahur.empresaTransporte;

import java.util.HashMap;

public class Categorias {
	private static HashMap<Integer, String> categorias = new HashMap<Integer, String>();

	private void asignarCategorias() {
		categorias.put(1, "Moto");
		categorias.put(2, "Autom�vil");
		categorias.put(3, "Autob�s");
	}

	static String getCategoria(Integer cat) {
		return categorias.get(cat);
	}
}