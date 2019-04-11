package br.com.procedimento;

/*
 * Objetivo     : 18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do
 * maior pelo menor valor.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 7 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc18 {

	public static void main(String[] args) {

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));

		difference(number1, number2);
	}

	public static void difference(int number1, int number2) {
		int difference;
		
		if (number1 > number2)
			difference = number1 - number2;
		else
			difference = number2 - number1;

		JOptionPane.showMessageDialog(null, "Diferen�a dos n�meros � " + difference, "Diferen�a de Dois N�meros",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
