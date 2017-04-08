package exericicio5;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource.AuthenticationType;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.EstadosDeOperacao;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class exercicio5 {
	
	@Test
	public void verificaNomeBancoDoBrasil() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		
		assertEquals("Banco do Brasil", bancoDoBrasil.obterNome());
	}
	
	@Test
	public void verificaMoedaBancoDoBrasil() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		
		assertEquals(Moeda.BRL, bancoDoBrasil.obterMoeda());
		
	}
	
	@Test
	public void verificaNomeAgenciaCentro() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		
		assertEquals("Centro", centro.obterNome());
		
	}
	
	@Test
	public void verificaIdentificadorAgenciaCentro() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		
		assertEquals("001", centro.obterIdentificador());
		
	}
	
	@Test
	public void verificaBancoAgenciaCentro() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		
		assertEquals("Banco do Brasil", centro.obterBanco().obterNome());
		
	}
	
	@Test
	public void verificaTitularContaMaria() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		
		assertEquals("Maria", contaMaria.obterTitular());
		
	}
	
	@Test
	public void verificaIdentificadorContaMaria() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		
		assertEquals("0001-5", contaMaria.obterIdentificador());
		
	}
	
	@Test
	public void verificaSaldoContaMaria() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		
		assertEquals("0,00", contaMaria.calcularSaldo().formatado().toString());
		
	}
	
	@Test
	public void verificaAgecniaContaMaria() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		
		assertEquals("Centro", contaMaria.obterAgencia().obterNome());
		
	}
	
	@Test
	public void verificaSucessoDoDeposito() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		EstadosDeOperacao estadoDeOperacao = Auxiliar.depositarEstado(sistemaBancario, contaMaria);
		
		assertEquals("SUCESSO", estadoDeOperacao.toString());
		
	}
	
	@Test
	public void verificaSaldoContaMariaAposDeposito() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		Auxiliar.depositar10Reais(sistemaBancario, contaMaria);
		assertEquals("10,00 BRL", contaMaria.calcularSaldo().formatarSemSinal());		
	}
	
	@Test
	public void verificaSaldoContaMariaAposSaque() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		Auxiliar.depositar10Reais(sistemaBancario, contaMaria);
		Auxiliar.saque6Reais(sistemaBancario, contaMaria);
		System.out.println(contaMaria.calcularSaldo().formatarSemSinal());
		assertEquals("4,00 BRL", contaMaria.calcularSaldo().formatarSemSinal());		
	}
	
	@Test
	public void verificaFalhaDoSaque() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		Auxiliar.depositar10Reais(sistemaBancario, contaMaria);
		Auxiliar.saque6Reais(sistemaBancario, contaMaria);
		Auxiliar.saque6Reais(sistemaBancario, contaMaria);
		EstadosDeOperacao estadoDeOperacao = Auxiliar.saqueEstado(sistemaBancario, contaMaria);
		
		assertEquals("SALDO_INSUFICIENTE", estadoDeOperacao.toString());
		
	}
	
	@Test
	public void verificaSaldoContaMariaAposSaque2() throws Exception{
		
		SistemaBancario sistemaBancario = Auxiliar.sistemaBancario();
		Banco bancoDoBrasil = Auxiliar.bancoDoBrasil(sistemaBancario);
		Agencia centro = Auxiliar.agenciaCentro(bancoDoBrasil);
		Conta contaMaria = Auxiliar.contaMaria(centro);
		Auxiliar.depositar10Reais(sistemaBancario, contaMaria);
		Auxiliar.saque6Reais(sistemaBancario, contaMaria);
		Auxiliar.saque6Reais(sistemaBancario, contaMaria);
		assertEquals("4,00 BRL", contaMaria.calcularSaldo().formatarSemSinal());		
	}
	
}
