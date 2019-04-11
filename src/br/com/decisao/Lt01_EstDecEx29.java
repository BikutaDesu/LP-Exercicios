package br.com.decisao;


/*
 * Objetivo: Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do
 * investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
 * poupan�a = 3% e a renda fixa = 5%. Demais tipos n�o ser�o considerados.
 * 
 * Autor: Victor Neves
 * Data: 14 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecEx29 {

	public static void main(String[] args) {

		// coletando o tipo de investimento a partir de um menu
		int tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog(null,
				"  Menu de op��es\n1 - Poupan�a\n2 - Renda Fixa\n- Digite sua op��o: ", "Tipo de Investimento",
				JOptionPane.PLAIN_MESSAGE));

		// coletando o valor do investimento
		double valorInvestimento = Double
				.parseDouble(JOptionPane.showInputDialog("- Digite o valor do investimento: "));

		if (tipoInvestimento < 1 || tipoInvestimento > 2 || valorInvestimento < 0.0)// valida tipo e valor do
																					// investimento
			JOptionPane.showMessageDialog(null, "Exception: tipo e/ou valor do investimento inval�do!", "Exception",
					JOptionPane.ERROR_MESSAGE);
		else {
			if (tipoInvestimento == 1)
				JOptionPane.showMessageDialog(null,
						String.format("Tipo investimento: Poupan�a%nValor ap�s 30 dias:%nde R$ %,.2f para R$ %,.2f.",
								valorInvestimento, valorInvestimento * 1.03)); // poupan�a rende = 3%
			else
				JOptionPane.showMessageDialog(null,
						String.format("Tipo investimento: Renda Fixa%nValor ap�s 30 dias:%nde R$ %,.2f para R$ %,.2f.",
								valorInvestimento, valorInvestimento * 1.05)); // renda fixa = 5%

		}

	}

}
