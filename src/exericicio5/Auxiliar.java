package exericicio5;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Dinheiro;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;


public class Auxiliar {
	
	public static void configuracoes(){
		
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco bancoDoBrasil = sistemaBancario.criarBanco("Banco do Brasil", Moeda.BRL);
		Agencia agenciaCentro = bancoDoBrasil.criarAgencia("Centro");
		Conta contaMaria = agenciaCentro.criarConta("Maria");
		
		//depositar
		Dinheiro dinheiroMaria = new Dinheiro(Moeda.BRL, 10, 0);
		
		sistemaBancario.depositar(contaMaria,dinheiroMaria);
		
		
	}
	
}
