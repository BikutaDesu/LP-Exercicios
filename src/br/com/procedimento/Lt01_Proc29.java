package br.com.procedimento;

/*
 * Objetivo     : 29. Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do investimento. 
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. Demais tipos n�o ser�o considerados
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc29 {

	public static void main(String[] args) {
		int tipoInvestimento = Integer.parseInt(JOptionPane
				.showInputDialog("Menu de op��es\n1. Poupan�a\n2. Renda fixa\n - Digite o tipo de invesvimento: "));

		double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do investimento:"));

		if (!(isValido(tipoInvestimento, valorInvestimento)))
			JOptionPane.showMessageDialog(null, "Error: dado(s) inv�lido(s)!", "Error", JOptionPane.ERROR_MESSAGE);
		else
			calculaInvestimento(tipoInvestimento, valorInvestimento);

	}

	public static boolean isValido(int tipoInvestimento, double valorInvestimento) {
		if (tipoInvestimento < 1 || tipoInvestimento > 2 || valorInvestimento <= 0.0)
			return false;
		else
			return true;

	}

	public static void calculaInvestimento(int tipoInvestimento, double valorInvestimento) {
		double valorCorrigido;

		if (tipoInvestimento == 1)
			valorCorrigido = valorInvestimento * 1.03;
		else 
			valorCorrigido = valorInvestimento * 1.05;

		JOptionPane.showMessageDialog(null, String.format("Valor ap�s 30 dias = R$ %,.2f", valorCorrigido), "",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
