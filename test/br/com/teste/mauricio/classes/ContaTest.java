package br.com.teste.mauricio.classes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ContaTest {

	@SuppressWarnings("deprecation")
	@Test
	public void deveAumentarCincoPorCentoContaCorrenteDezPorCentoContaPoupanca() {
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(100);
		
		
		List<Conta> listaContas = new ArrayList<Conta>();
		listaContas.add(contaCorrente);
		listaContas.add(contaPoupanca);

		AtualizadorConta atualizadorConta = new AtualizadorTodasContas();
		for (Conta conta : listaContas) {
			conta.atualiza(atualizadorConta);
		}
		
		assertEquals(105, contaCorrente.getSaldo(),0);
		assertEquals(110, contaPoupanca.getSaldo(),0);
	}

}
