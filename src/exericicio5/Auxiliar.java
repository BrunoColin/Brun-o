package exericicio5;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Dinheiro;
import br.ufsc.ine.leb.sistemaBancario.EstadosDeOperacao;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;


public class Auxiliar {
	
	public static SistemaBancario sistemaBancario(){
		
		SistemaBancario sistemaBancario = new SistemaBancario();
		return sistemaBancario;
	}
	
	public static Banco bancoDoBrasil(SistemaBancario sistemaBancario){
		
		return sistemaBancario.criarBanco("Banco do Brasil", Moeda.BRL);
	}
	
	public static Agencia agenciaCentro(Banco banco){
	
		return banco.criarAgencia("Centro");
	
	}
			
	public static Conta contaMaria(Agencia agencia){
		
		return agencia.criarConta("Maria");
	}	
	
	public static EstadosDeOperacao depositarEstado(SistemaBancario sistemaBancario,Conta contaMaria){
		
		Dinheiro dinheiroMaria = new Dinheiro(Moeda.BRL, 10, 0);
		
		
		return sistemaBancario.depositar(contaMaria,dinheiroMaria).obterEstado();
		
	}
	
	public static void depositar10Reais(SistemaBancario sistemaBancario,Conta contaMaria){
		
		Dinheiro dinheiroMaria = new Dinheiro(Moeda.BRL, 10, 0);
		
		
		sistemaBancario.depositar(contaMaria,dinheiroMaria).obterEstado();
		
	}
	
	public static void saque6Reais(SistemaBancario sistemaBancario,Conta contaMaria){
		
		//depositar10Reais(sistemaBancario, contaMaria);
		
		Dinheiro dinheiroMaria = new Dinheiro(Moeda.BRL, 6, 0);
		
		sistemaBancario.sacar(contaMaria, dinheiroMaria);
		
	}
	
	public static EstadosDeOperacao saqueEstado(SistemaBancario sistemaBancario,Conta contaMaria){
		
		Dinheiro dinheiroMaria = new Dinheiro(Moeda.BRL, 6, 0);
		
		
		return sistemaBancario.sacar(contaMaria,dinheiroMaria).obterEstado();
		
	}
	
}
