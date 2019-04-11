package br.com.funcao;
import javax.swing.JOptionPane;

/*
 * Objetivo     : 36. Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
 *
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

public class Lt01_Func36 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));

		JOptionPane.showMessageDialog(null, String.format("Resultado da s�rie = %,.2f", serie36(number)),
				"S�rie  1 + 1/1! + 1/2! + ... + 1/N!", JOptionPane.INFORMATION_MESSAGE);

	}

	// Calcula a s�rie 1 + 1/1! + 1/2! + ... + 1/N! e retorna o resultado
	public static double serie36(int number) {
		double serie = 1;

		for (int i = 1; i <= number; i++) {
			// calcula fatorial do denominador
			int fat = 1;
			for (int j = 1; j <= i; j++)
				fat *= j;

			serie += (double) 1 / fat;
		}
		return serie;
	}

}
