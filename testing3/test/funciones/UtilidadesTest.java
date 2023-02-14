package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtilidadesTest {
	private static Utilidades utils;//hago esto porque las funciones no son static entonces necesito instanciar un objeto en static de la clase.

	@BeforeAll// necesito instanciar el objeto por eso se usa este
	static void setUpBeforeClass() throws Exception {
		utils = new Utilidades();
		
	//el @BeforeEach se rellenan los datos nuevos y se generan
	}

	@Test
	void testDevuelveNota() {
		assertThrows(ArithmeticException.class, 
				()-> utils.devuelveNota(-2));
		
		assertThrows(ArithmeticException.class, 
				()-> utils.devuelveNota(11));
		assertEquals ("Suspenso", 	utils.devuelveNota (0), "Debería devolver Suspenso");
		
		assertEquals ("Suspenso", 	utils.devuelveNota (4), "Debería devolver Suspenso");
		assertEquals ("Bien", 	utils.devuelveNota (5), "Debería devolver Bien");
	
	assertEquals ("Notable", utils.devuelveNota(6.5),"Debería devolver Notable");
		
	assertEquals ("Notable", utils.devuelveNota(8),"Debería devolver Notable");
	
	assertEquals ("Sobresaliente", utils.devuelveNota(9),"Debería devolver Sobresaliente");
	assertEquals ("Sobresaliente", utils.devuelveNota(8.5),"Debería devolver Sobresaliente");
	
	assertEquals ("Matrícula", utils.devuelveNota(10),"Debería devolver Matrícula");
		
	}
	
	@Test
	void testCalculaSalario() {
		
		assertThrows(ArithmeticException.class, 
				()-> utils.calculaSalario(-40, 50, 55));
		assertThrows(ArithmeticException.class, 
				()-> utils.calculaSalario(0, 50, 55));
		assertThrows(ArithmeticException.class, 
				()-> utils.calculaSalario(40, -50, 55));
		assertThrows(ArithmeticException.class, 
				()-> utils.calculaSalario(-40, 0, 55));
		assertThrows(ArithmeticException.class, 
				()-> utils.calculaSalario(40, 50, -55));
		assertThrows(ArithmeticException.class, 
				()-> utils.calculaSalario(-40, 50, 0));
		
		assertEquals(1900,utils.calculaSalario(38, 50, 0),"Error, no debería contabilizar horas extras");
		
		assertEquals(2010,utils.calculaSalario(40, 50, 55),"Error al contabilizar horas extras");
		assertEquals(Utilidades.HORASJORNADA, 10,20);
		
	}
	@Test
	void cuentaDivisores() {
		assertEquals (2, utils.cuentaDivisores(5),"Error mal computo de los divisores");
		assertEquals (1, utils.cuentaDivisores(1),"Error mal computo de los divisores");
		assertEquals (2, utils.cuentaDivisores(37),"Error mal cómputo de los divisores");//
		
		
		
			
	}
	@Test
	void devuelveMenor() {
		
		int v[]= {2,8,-3,10};
		
		assertEquals (-3, utils.devuelveMenor(v), "Error, debe devolver el menor");
		
		assertEquals (2, utils.devuelveMenor(v), "Error, debe devolver el menor");
		
	}
	
	@Test
	void burbuja() {
		int v []= {2,-1,3,11};
		int j []= {-1,2,3,11};
		int v2 []= {2,1,3,11};
		int j2 []= {1,2,3,11};
		assertArrayEquals (utils.burbuja(v), j);
		assertArrayEquals (utils.burbuja(v2), j2);
		//david usa otro con dos números repetidos.
	}
	
}
