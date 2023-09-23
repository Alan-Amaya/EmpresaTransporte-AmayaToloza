package ar.edu.unahur.empresaTransporte;

import org.junit.Assert;
import org.junit.Test;

public class EmpresaTransporteTest {
	
	public Categorias crearCategorias() {
		Categorias listaCategorias = new Categorias();
		return listaCategorias;
	}

	@Test
	public void crearChoferYCorroborarCategoria() {
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez");
		marioGonzalez.asignarNroCategoria(1);
		String valorEsperado = "Moto";
		String valorObtenido = null;
		marioGonzalez.getNombreCategoria();
		marioGonzalez.getNombre();
		marioGonzalez.getId();;
		//Ejecucion
		valorObtenido = marioGonzalez.getNombreCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void crearChoferConCategoriaErronea() {
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez");
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = marioGonzalez.asignarNroCategoria(4);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void crearAutobusAsignarChoferYCorroborarSuId() {
		//Preparacion
		Autobus tum = new Autobus();
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez");
		marioGonzalez.asignarNroCategoria(3);
		tum.asignarChoferPorId_(marioGonzalez);
		Integer valorEsperado = marioGonzalez.getId();
		Integer valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getChoferId();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
