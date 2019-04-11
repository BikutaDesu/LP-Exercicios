package br.com.funcao;
import javax.swing.JOptionPane;

/*
 * Objetivo     : 34. Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func34 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));

		JOptionPane.showMessageDialog(null, resultaTabuada(number), "Tabuada do " + number,
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static String resultaTabuada(int number) {
		String result = "";

		for (int i = 1; i <= 10; i++)
			result += number + " x " + i + " = " + (number * i) + "\n";

		return result;

	}

}
