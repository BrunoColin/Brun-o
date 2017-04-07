package exercicio4.delegate;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class Auxiliar {

	
	public static Banco criarCaixaEconomica(){
		SistemaBancario sistemaBancario = new SistemaBancario();
		return sistemaBancario.criarBanco("Caixa Econômica", Moeda.BRL);	
	}
	
	public static Agencia criarAgencia(Banco banco){
		return banco.criarAgencia("Trindade");
	}
	
	public static Conta criarConta(Agencia agencia){
		return agencia.criarConta("João");
	}
	
}
