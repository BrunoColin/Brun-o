package teste;

import static org.junit.Assert.*;

import java.io.File;
		
import org.junit.Test;

public class testes {

	@Test
	public void meuTeste() throws Exception{
		
		String nome = "Bruno";
		assertEquals("Bruno", nome);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void meuTeste2() throws Exception {
		Integer numero = 10/0;
	}
	
}
