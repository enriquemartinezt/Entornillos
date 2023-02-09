package paquete1;

//assertTrue(), assertFalse(), assertNull(),
//assertNotNull o assertEquals
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testDistancia() {
		
		double resulEsperado=3;
		Calculadora calcu1= new Calculadora(5,2);
		double resulReal1=calcu1.distancia();
		
		assertEquals(resulEsperado,resulReal1,
				"Caquita en la distancia CP1");
		
		Calculadora calcu2= new Calculadora(2,5);
		double resulReal2=calcu2.distancia();
		
		assertEquals(resulEsperado,resulReal2,
				"Caquita en la distancia CP2");
		
	}

	@Test
	void testResta2() {
		
		Calculadora calcu1= new Calculadora(5,2);
		boolean resulReal1=calcu1.resta2();
		
		assertTrue(resulReal1,
				"Caquita en la resta2 CP1");
		
		Calculadora calcu2= new Calculadora(2,5);
		boolean resulReal2=calcu2.resta2();
		
		assertFalse(resulReal2,
				"Caquita en la resta2 CP2");
		
	}

	@Test
	void testDivide2() {
		
		try{
			Calculadora calcu1=new Calculadora(50,0);
		
		double resulReal1=calcu1.divide2();
		
		}catch(java.lang.ArithmeticException e){
			//correcto
		}
		
		double resulEsperado2=50;
		
		Calculadora calcu2=new Calculadora(50,1);
		
		double resulReal2=calcu2.divide2();
		assertEquals(resulEsperado2,resulReal2,
				"Caquita en divide2 CP1");
		
	}

}
