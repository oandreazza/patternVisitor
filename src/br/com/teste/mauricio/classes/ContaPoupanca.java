package br.com.teste.mauricio.classes;

public class ContaPoupanca extends Conta{

	@Override
	public void atualiza(AtualizadorConta atualizadorConta) {
		atualizadorConta.atualiza(this);
	}

}
