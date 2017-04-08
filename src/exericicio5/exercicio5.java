package exericicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class exercicio5 {

	@Test
	public void verificaSistemaBancario() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		
		assertEquals(true, sistemaBancario.obterBancos());
		
	}
	
	
}
