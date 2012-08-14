package br.com.teste.mauricio.classes;

public class AtualizadorTodasContas implements AtualizadorConta {

	@Override
	public void atualiza(ContaCorrente contaCorrente) {
		double porcentagem = contaCorrente.getSaldo() * 0.05;
		contaCorrente.setSaldo(contaCorrente.getSaldo()+porcentagem);

	}

	@Override
	public void atualiza(ContaPoupanca contaPoupanca) {
		double porcentagem = contaPoupanca.getSaldo() * 0.1;
		contaPoupanca.setSaldo(contaPoupanca.getSaldo()+porcentagem);
	}

}
