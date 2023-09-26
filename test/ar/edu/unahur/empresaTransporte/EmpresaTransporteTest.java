package ar.edu.unahur.empresaTransporte;

import org.junit.Assert;
import org.junit.Test;

public class EmpresaTransporteTest {
	
	public Categorias crearCategorias() {
		Categorias listaCategorias = new Categorias();
		return listaCategorias;
	}
	
//ChoferTest
	@Test
	public void crearChoferYCorroborarCategoria() {
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 1);
		String valorEsperado = "Moto";
		String valorObtenido = null;
		//Ejecucion
		valorObtenido = marioGonzalez.getNombreCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void crearChoferYCorroborarSuId() {
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 1);
		Integer valorEsperado = 11;
		Integer valorObtenido = null;
		//Ejecucion
		valorObtenido = marioGonzalez.getId();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void crearChoferConCategoriaErronea() {
		crearCategorias();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 4);
		String valorEsperado = null;
		String valorObtenido = "";
		//Ejecucion
		valorObtenido = marioGonzalez.getNombreCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}

//AutobusTest
	@Test
	public void crearAutobusYCorroborarSuCategoria() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		String valorEsperado = "Autobus";
		String valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void crearAutobusAsignarChoferYCorroborarSuId() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		Integer valorEsperado = marioGonzalez.getId();
		Integer valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getChoferId();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void subirPasajeroConChofer() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		//Ejecucion
		valorObtenido = tum.sumarPasajero();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void subirPasajeroSinChofer() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.sumarPasajero();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void subirPasajeroConAutobusLleno() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		for (Integer asiento = 0; asiento < 20; asiento++) {
			tum.sumarPasajero();
		}
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.sumarPasajero();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void intentarCambiarChoferConPasajeroArriba() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		Chofer jorgeAlvarez = new Chofer(12, "Jorge Alvarez", 3);
		tum.asignarChofer(marioGonzalez);
		tum.sumarPasajero();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.asignarNuevoChofer(jorgeAlvarez);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void cambiarChoferSinPasajeroArriba() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		Chofer jorgeAlvarez = new Chofer(12, "Jorge Alvarez", 3);
		tum.asignarChofer(marioGonzalez);
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		//Ejecucion
		valorObtenido = tum.asignarNuevoChofer(jorgeAlvarez);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void corroborarQueNoEstaVacio() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		tum.sumarPasajero();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.noHayPasajeros();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void corroborarQueHayaTresAsientosOcupados() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		for (Integer asiento = 0; asiento < 3; asiento++) {
			tum.sumarPasajero();
		}
		Integer valorEsperado = 3;
		Integer valorObtenido = 0;
		//Ejecucion
		valorObtenido = tum.asientoLibreNroX();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void vaciarAsientosYCorroborarQueEsteVacio() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		for (Integer asiento = 0; asiento < 3; asiento++) {
			tum.sumarPasajero();
		}
		tum.vaciarAsientos();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.noHayPasajeros();
		/*Preguntarle al profe:  
			¿Como es posible que tire false y funcione todo?.*/
		System.out.println("Hay pasajero? " + tum.noHayPasajeros());
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void recorrerCuatroKm() {
		//Preparacion
		crearCategorias();
		Autobus tum = new Autobus();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		for (Integer asiento = 0; asiento < 3; asiento++) {
			tum.sumarPasajero();
		}
		tum.recorrer_Km(4);
		Integer valorEsperado = tum.getCantdKmRecorridos();
		Integer valorObtenido = null;
		//Ejecucion
		valorObtenido = 4;
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	
	//AUTO
	
	@Test
	public void crearUnAutoAsignarChoferYCorroborarSuId() {
		//Preparacion
		crearCategorias();
		Automovil tum = new Automovil();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 2);
		tum.asignarChofer(marioGonzalez);
		Integer valorEsperado = marioGonzalez.getId();
		Integer valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getChoferId();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void vaciarElAutoYCorroborarQueEsteVacio() {
		//Preparacion
		crearCategorias();
		Automovil tum = new Automovil();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 2);
		tum.asignarChofer(marioGonzalez);
		for (Integer asiento = 0; asiento < 3; asiento++) {
			tum.sumarPasajero(asiento);
		}
		tum.vaciarAsientos();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.noHayPasajeros();
		/*Preguntarle al profe:  
			¿Como es posible que tire false y funcione todo?.*/
		System.out.println("Hay pasajero? " + tum.noHayPasajeros());
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void crearAutoYCorroborarSuCategoria() {
		//Preparacion
		crearCategorias();
		Automovil tum = new Automovil();
		String valorEsperado = "Automovil";
		String valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void subirPasajeroConElAutoLleno() {
		//Preparacion
		crearCategorias();
		Automovil tum = new Automovil();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 3);
		tum.asignarChofer(marioGonzalez);
		tum.sumarPasajero(3);
		
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.sumarPasajero(1);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	// MOTO
	
	@Test
	public void crearUnaMotoYCorroborarSuCategoria() {
		//Preparacion
		crearCategorias();
		Moto tum = new Moto();
		String valorEsperado = "Moto";
		String valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getCategoria();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void crearUnaMotoAsignarChoferYCorroborarSuId() {
		//Preparacion
		crearCategorias();
		Moto tum = new Moto();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 1);
		tum.asignarChofer(marioGonzalez);
		Integer valorEsperado = marioGonzalez.getId();
		Integer valorObtenido = null;
		//Ejecucion
		valorObtenido = tum.getChoferId();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void intentarCambiarConductorDeMotoConCopilotoArriba() {
		//Preparacion
		crearCategorias();
		Moto tum = new Moto();
		Chofer marioGonzalez = new Chofer(11, "Mario Gonzalez", 1);
		Chofer jorgeAlvarez = new Chofer(12, "Jorge Alvarez", 1);
		tum.asignarChofer(marioGonzalez);
		tum.sumarPasajero();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		//Ejecucion
		valorObtenido = tum.asignarNuevoChofer(jorgeAlvarez);
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
