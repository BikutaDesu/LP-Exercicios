package br.com.procedimento;

/*
 * Objetivo     : 28. Receba o pre�o atual e a m�dia mensal de um produto. 
 * Calcule e mostre o novo pre�o sabendo que: 
 * Venda Mensal            Pre�o Atual            Pre�o Novo 
 * < 500                     < 30                  + 10% 
 * >= 500 e < 1000           >= 30 e < 80          + 15% 
 * >= 1000                   >= 80                 - 5% 
 * 
 * Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc28 {

	public static void main(String[] args) {

		double precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o atual"));
		double vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal"));

		novoPreco(precoAtual, vendaMensal);

	}

	public static void novoPreco(double precoAtual, double vendaMensal) {
		double precoNovo = precoAtual; 

		if (vendaMensal < 500.0 && precoAtual < 30)
			precoNovo = precoAtual * 1.10;
		else if (vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >= 30 && precoAtual < 80)
			precoNovo = precoAtual * 1.15;
		else if (vendaMensal >= 1000.0 && precoAtual >= 80)
			precoNovo = precoAtual * 0.95;

		JOptionPane.showMessageDialog(null, String.format("Pre�o novo = R$ %,.2f", precoNovo), "Novo Pre�o do Produto",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
