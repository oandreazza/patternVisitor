package br.com.teste.mauricio.classes;

public abstract class Conta implements Atualizavel {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
