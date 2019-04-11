package br.com.funcao;
import javax.swing.JOptionPane;

/*
 * Objetivo     : 40. Receba 2 n�meros inteiros. Verifique e mostre todos os n�meros primos
 * existentes entre eles.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func40 {
	private enum Status {
		YES, NO
	};

	public static void main(String[] args) {

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro"));

		JOptionPane.showMessageDialog(null, "Primos Entre os N�meros Digitados: " + primos(number1, number2),
				"Primos entre os n�meors ", JOptionPane.PLAIN_MESSAGE);

	}

	/*
	 * recebe dois n�meros e retorna uma String com os n�mero primos entre eles,
	 * caso n�o tenha nenhum retorna "nenhum."
	 */
	public static String primos(int number1, int number2) {
		String primosString = "";
		int largest;
		int smaller;

		Status primo = Status.YES;

		// identifica qual o maior e menor
		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		// Verifique e mostre todos os n�meros primos existentes entre eles
		for (int i = smaller + 1; i < largest; i++) {

			// verica se i � primo
			double root = Math.sqrt(i);
			for (int j = 2; j <= root; j++) {
				if (i % j == 0) {
					primo = Status.NO;
					break; // para o loop
				}
			}

			if (primo == Status.YES && i != 1)
				primosString += i + " ";

			primo = Status.YES;
		}

		// configua a primosString caso n�o tenha nenhum primo
		if (primosString.equals(""))
			primosString = "nenhum.";

		return primosString;
	}

}
