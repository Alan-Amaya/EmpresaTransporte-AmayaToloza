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
		String valorObtenido;
		//Ejecucion
		valorObtenido = marioGonzalez.getNombreCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void crearChoferConCategoriaErronea() {
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez");
		marioGonzalez.asignarNroCategoria(4);
		Integer valorEsperado = null;
		String valorObtenido;
		//Ejecucion
		valorObtenido = marioGonzalez.getNombreCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void crearAutobusAsignarChoferYCorroborarSuId() {
		//Preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(3);
		Autobus miBondi = new Autobus(mario);
		miBondi.asignarChoferConId_(mario);
		Integer valorEsperado = 11;
		Integer valorObtenido;
		//Ejecucion
		valorObtenido = miBondi.chofer.getId();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void zonaPruebas() {
		Autobus tum = new Autobus();
		crearCategorias();
		for (int i = 0; i<20; i++) {tum.asientos.set(i, "Ocupado");}
		System.out.println(tum.asientos);
		tum.sumarPasajero();
		System.out.println(tum.asientos);	   
	}
}
