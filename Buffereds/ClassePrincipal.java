package Buffereds;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {
  public static void main(String[] args) throws IOException {
	  Contas[] conta = new Contas[5];
	  Metodos m = new Metodos();
	  
	  int num, i, opc = 0;
	  
	  for(i=0; i<5; i++) {
		  conta[i] = new Contas();
	  }
	  
	  while(opc != 9) {
		  
		  opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Cadastrar Contas  \n 3 - Mostrar Contas \n 9 - Finaliza"));
		  
		  switch(opc) {
		  
		  case 1: conta = m.CadastraConta(conta);
		          break;
		  case 3: m.Mostrar(conta);
		          break;
		  case 9: JOptionPane.showMessageDialog(null, "Finaliza programa");
		          break;
		  default: JOptionPane.showinputDialog(null, "Opção Inválida, tente novamente");
		  }
	  }
  }
}
