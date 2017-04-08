package exericicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class exercicio5 {

	@Test
	public void verificaSistemaBancario() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		
		assertEquals(true, sistemaBancario.obterBancos());
		
	}
	
	@Test
	public void verificaNomeBancoDoBrasil() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		
		assertEquals("Banco do Brasil", bancoDoBrasil.obterNome());
		//assertEquals("Banco do Brasil", Auxiliar.bancoDoBrasil(sistemaBancario).obterNome());
		
	}
	
	@Test
	public void verificaMoedaBancoDoBrasil() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		
		assertEquals(Moeda.BRL, bancoDoBrasil.obterMoeda());
		
	}
	
	@Test
	public void verificaNomeAgencia() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		
		assertEquals("Centro", centro.obterNome());
		
	}
	
	@Test
	public void verificaCodigoAgencia() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		
		assertEquals("001", centro.obterIdentificador());
		
	}
	
	
	
	
}
