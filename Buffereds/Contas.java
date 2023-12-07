package Buffereds;

public class Contas {

	String nomeCliente;
	int numeroConta;
	double saldoCliente;
	
	Contas(){
		this("",0,0.0);
	}
	
	public Contas(String nome, int numero, double saldo) {
		nomeCliente = nome;
		numeroConta = numero;
		saldoCliente = saldo;
	}
}
