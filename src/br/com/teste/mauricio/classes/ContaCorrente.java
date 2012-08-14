package br.com.teste.mauricio.classes;

public class ContaCorrente extends Conta {

	@Override
	public void atualiza(AtualizadorConta atualizadorConta) {
		atualizadorConta.atualiza(this);
	}

}
