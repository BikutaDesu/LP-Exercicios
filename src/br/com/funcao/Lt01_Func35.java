package br.com.funcao;
import javax.swing.JOptionPane;

/*
 * Objetivo     : 35. Receba 2 n�meros inteiros, verifique qual o maior entre eles. Calcule e
 * mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func35 {

	public static void main(String[] args) {

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero inteiro"));

		JOptionPane.showMessageDialog(null, String.format("Somat�ria dos impares entre %d e %d = %d", number1, number2,
				somatoriaImpares(number1, number2)), "Somat�ria Impares", JOptionPane.INFORMATION_MESSAGE);
		somatoriaImpares(number1, number2);

	}

	public static int somatoriaImpares(int number1, int number2) {
		int largest;
		int smaller;
		int result = 0;

		// determina qual o maior e menor
		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		// calcula somat�ria
		for (int i = smaller + 1; i < largest; i++) {
			if (i % 2 == 1)
				result += i;
		}

		return result;

	}
}
