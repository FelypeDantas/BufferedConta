package Buffereds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Metodos {

	public static void main(String[] args) {
		

	}

	public Contas[] CadastraConta(Contas[] conta) throws IOException {
		int i;
		String fileName = "ArquivoContas";
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
		
		for(i=0; i<5; i++) {
			conta[i].nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
			gravar.write(conta[i].nomeCliente);
			gravar.newLine();
			conta[i].numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
			gravar.write(Integer.toString(conta[i].numeroConta));
			gravar.newLine();
			conta[i].saldoCliente = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta: "));
			gravar.write(Double.toString(conta[i].saldoCliente));
			gravar.newLine();
		}
		gravar.close();
		JOptionPane.showMessageDialog(null, "Cadastro Feito com Sucesso");
		return conta;
	}


	public void Mostrar(Contas[] conta) {
		int i;
		for(i=0; i<5; i++) {
			System.out.println("O nome do Cliente: " + conta[i].nomeCliente);
			System.out.println("O numero da conta dele: " + conta[i].numeroConta);
			System.out.println("O saldo disponivel: R$ " + conta[i].saldoCliente);
			System.out.println("________________________________________________________");
		}
		
	}

}
