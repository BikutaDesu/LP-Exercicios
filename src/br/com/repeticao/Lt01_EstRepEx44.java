package br.com.repeticao;
import javax.swing.JOptionPane;

/*
 * Objetivo   : Receba o n�mero da base e do expoente. 
 * Calcule e mostre o valor da pot�ncia.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx44 {

	public static void main(String[] args) {

		// Receba o n�mero da base e do expoente
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o base: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));

		// Calcule e mostre o valor da pot�ncia
		int pow = 1;
		for (int i = 0; i < expoente; i++)
			pow *= base;

		JOptionPane.showMessageDialog(null, String.format("%d ^ %d = %d", base, expoente, pow), "Resultado da Pot�ncia",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
