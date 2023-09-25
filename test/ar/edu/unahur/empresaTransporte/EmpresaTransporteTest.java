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
	public void subirPasajeroAlAutobus() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(3);
		Autobus miBondi = new Autobus(mario);
		miBondi.asignarChoferConId_(mario);
		miBondi.sumarPasajero();
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido;
		//Ejecucion
		valorObtenido = !miBondi.vehiculoVacio();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void tratarDeSubirPasajeroConBondiLleno() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(3);
		Autobus miBondi = new Autobus(mario);
		miBondi.asignarChoferConId_(mario);
		while(!miBondi.vehiculoLleno()) {miBondi.sumarPasajero();}
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido;
		//Ejecucion
		valorObtenido = miBondi.sumarPasajero();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void vaciarBondi() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(3);
		Autobus miBondi = new Autobus(mario);
		miBondi.asignarChoferConId_(mario);
		while(!miBondi.vehiculoLleno()) {miBondi.sumarPasajero();}
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido;
		//Ejecucion
		miBondi.vaciarAsientos();
		valorObtenido = miBondi.vehiculoVacio();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test //REVISAR ALE
	public void cambiarChofer() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(3);
		
		Chofer julio = new Chofer(10, "Julio de Las Mercedes");
		julio.asignarNroCategoria(3);
		
		Autobus miBondi = new Autobus(mario);
		miBondi.asignarChoferConId_(mario);
		Chofer valorEsperado = julio;
		Chofer valorObtenido;
		//Ejecucion
		miBondi.asignarNuevoChoferPorId_(julio);
		valorObtenido = miBondi.chofer;
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test 
	public void cambiarChoferConPasajerosEnElBondi() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(3);
		
		Chofer julio = new Chofer(10, "Julio de Las Mercedes");
		julio.asignarNroCategoria(3);
		
		Autobus miBondi = new Autobus(mario);
		miBondi.asignarChoferConId_(mario);
		Chofer valorEsperado = mario;
		Chofer valorObtenido;
		//Ejecucion
		while(!miBondi.vehiculoLleno()) {miBondi.sumarPasajero();}
		miBondi.asignarNuevoChoferPorId_(julio);
		valorObtenido = miBondi.chofer;
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	// AUTOMOVIL
	
	@Test
	public void llenarAuto() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(2);
		
		Autobus miAuto = new Autobus(mario);
		miAuto.asignarChoferConId_(mario);
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido;
		//Ejecucion
		while(!miAuto.vehiculoLleno()) {miAuto.sumarPasajero();}
		valorObtenido = miAuto.vehiculoLleno();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void vaciarAuto() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(2);
		Autobus miAuto = new Autobus(mario);
		miAuto.asignarChoferConId_(mario);
		while(!miAuto.vehiculoLleno()) {miAuto.sumarPasajero();}
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido;
		//Ejecucion
		miAuto.vaciarAsientos();
		valorObtenido = miAuto.vehiculoVacio();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
}
	
	// MOTO
	
	@Test
	public void llenarMoro() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(1);
		
		Autobus miMoto = new Autobus(mario);
		miMoto.asignarChoferConId_(mario);
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido;
		//Ejecucion
		while(!miMoto.vehiculoLleno()) {miMoto.sumarPasajero();}
		valorObtenido = miMoto.vehiculoLleno();
		//Contrastacion o Validacion
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void  vaciarMoto() {
		//preparacion
		crearCategorias();
		Chofer mario = new Chofer(11, "Mario Gonzalez");
		mario.asignarNroCategoria(1);
		Autobus miMoto = new Autobus(mario);
		miMoto.asignarChoferConId_(mario);
		while(!miMoto.vehiculoLleno()) {miMoto.sumarPasajero();}
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido;
		//Ejecucion
		miMoto.vaciarAsientos();
		valorObtenido = miMoto.vehiculoVacio();
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
