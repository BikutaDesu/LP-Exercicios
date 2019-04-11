package br.com.repeticao;
import java.util.Scanner;

/*
 * Objetivo   : Receba um n�mero inteiro. Calcule e mostre 
 * a s�rie de Fibonacci at� o seu N�n�simo termo.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int termo;

		// Receba um n�mero inteiro
		System.out.print("Enter a number: ");
		termo = input.nextInt();
		input.close();

		// Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo
		int numAnterior = 1;
		int numAtual = 1;

		for (int i = 0; i < termo; i++) {

			if (i < 2)
				System.out.print(1 + " ");
			else {
				int numProximo = numAnterior + numAtual;

				System.out.printf("%d ", numProximo);

				numAnterior = numAtual;
				numAtual = numProximo;
			}

		}

	}

}
