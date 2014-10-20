package es.upm.miw.pd.ecp1.vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GestionDeVehiculosTest {

	Vehiculo moto;
	Vehiculo coche;
	Vehiculo bicicleta;

	@Before
	public void ini() {
		moto = new Moto(1, "Descripcion_moto");
		coche = new Coche(2, "Descripcion_coche", CategoriaCoche.A);
		bicicleta = new Bicicleta(3, "Descripcion_bicicleta");

	}

	@Test
	public void alquilerCocheCategoriaATest() {
		assertEquals(30, coche.precioAlquiler(3), 10e-5);
		assertEquals(62, coche.precioAlquiler(7), 10e-5);
		assertEquals(67, coche.precioAlquiler(8), 10e-5);
	}

	@Test
	public void alquilerCocheCategoriaBTest() {
		coche = new Coche(2, "Descripcion_coche", CategoriaCoche.B);

		assertEquals(45, coche.precioAlquiler(3), 10e-5);
		assertEquals(93, coche.precioAlquiler(7), 10e-5);
		assertEquals(100.5, coche.precioAlquiler(8), 10e-5);

	}

	@Test
	public void alquilerCocheCategoriaCTest() {
		coche = new Coche(2, "Descripcion_coche", CategoriaCoche.C);

		assertEquals(60, coche.precioAlquiler(3), 10e-5);
		assertEquals(124, coche.precioAlquiler(7), 10e-5);
		assertEquals(134, coche.precioAlquiler(8), 10e-5);
	}

	@Test
	public void alquilerMotoTest() {
		assertEquals(40, moto.precioAlquiler(5), 10e-5);
		assertEquals(56, moto.precioAlquiler(7), 10e-5);
		assertEquals(70, moto.precioAlquiler(10), 10e-5);
	}

	@Test
	public void calcularAlquilerBicicletaTest() {
		assertEquals(6, bicicleta.precioAlquiler(2), 10e-5);
		assertEquals(12, bicicleta.precioAlquiler(5), 10e-5);
	}

	@Test
	public void mostratVehiculoTest() {
		assertEquals("ID: 1 - Tipo vehiculo: MOTO - Descripcion: Descripcion_moto",
				moto.toString());
		assertEquals("ID: 2 - Tipo vehiculo: COCHE - Categoria: A - Descripcion: Descripcion_coche",
				coche.toString());
		assertEquals("ID: 3 - Tipo vehiculo: BICICLETA - Descripcion: Descripcion_bicicleta",
				bicicleta.toString());
	}

}
