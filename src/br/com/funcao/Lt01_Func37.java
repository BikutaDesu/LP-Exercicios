package br.com.funcao;
import javax.swing.JOptionPane;

/*
 * Objetivo     : 37. Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu
 * N�n�simo termo.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func37 {

	public static void main(String[] args) {

		int termo = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));

		JOptionPane.showMessageDialog(null, fibonacci(termo), "S�rie Fibonacci", JOptionPane.PLAIN_MESSAGE);
	}

	// Calcula e retorna a s�rie de Fibonacci at� o seu N�n�simo termo em um String
	public static String fibonacci(int termo) {
		String fibonacciSerie = "";
		int numAnterior = 1;
		int numAtual = 1;

		for (int i = 0; i < termo; i++) {

			if (i < 2)
				fibonacciSerie += 1 + " ";
			else {
				int numProximo = numAnterior + numAtual;

				fibonacciSerie += numProximo + " ";

				numAnterior = numAtual;
				numAtual = numProximo;
			}
		}

		return fibonacciSerie;

	}

}
