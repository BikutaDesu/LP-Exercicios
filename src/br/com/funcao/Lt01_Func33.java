package br.com.funcao;
/*
 * Objetivo     : 33. Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Func33 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro",
				"S�rie 1 + 1/2 + 1/3 + ... + 1/N", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resultado da s�rie = %,.2f", serie33(number)),
				"S�rie 1 + 1/2 + 1/3 + ... + 1/N", JOptionPane.INFORMATION_MESSAGE);

	}

	// Calcula e retorna o resultado da s�rie 1 + 1/2 + 1/3 + ... + 1/N.
	public static double serie33(int number) {
		double series = 0;

		for (int i = 1; i <= number; i++)
			series += (double) 1 / i;

		return series;

	}

}
