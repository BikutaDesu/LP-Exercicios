package br.com.repeticao;
import javax.swing.JOptionPane;

/*
 * Objetivo   : Receba um n�mero inteiro. Calcule e mostre o seu fatorial.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx32 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a integer: ", "Calculate the Factorial",
				JOptionPane.QUESTION_MESSAGE));
		int fat = 1;
		for (int i = number; i > 1; i--)
			fat *= i;

		JOptionPane.showMessageDialog(null, String.format("%d! = %d", number, fat), "Factorial is",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
