package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	Cuenta cuenta, cuenta12345, cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(0d, "00000", "Samuel", new ArrayList<Movimiento>());
		cuenta12345 = new Cuenta(50d, "12345", "Ana", new ArrayList<Movimiento>());
		cuenta67890 = new Cuenta(0d, "67890", "Adrian", new ArrayList<Movimiento>());
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(1d);
		
		assertEquals(1, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(1d);
		
		assertEquals(-1, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		cuenta12345.retirar(200d);
		cuenta67890.retirar(350d);
		cuenta12345.ingresar(100d);
		cuenta67890.retirar(200d);
		cuenta67890.retirar(150d);
		cuenta12345.retirar(200d);
		cuenta67890.ingresar(50d);
		cuenta67890.retirar(100d);
		
		boolean comprobar = false;
		
		if (cuenta12345.getSaldo() == -250d && cuenta67890.getSaldo() == -450d) {
			comprobar = true;
		}
		
		assertTrue(comprobar);
	}

}
