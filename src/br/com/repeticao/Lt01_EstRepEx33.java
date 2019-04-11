package br.com.repeticao;

/*
 * Objetivo   : Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstRepEx33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;
		double serie = 0;

		// Recebe um n�mero
		System.out.print("Enter a integer: ");
		number = input.nextInt();
		input.close();

		// calcula s�rie 1 + 1/2 + 1/3 + ... + 1/N
		for (int i = 1; i <= number; i++)
			serie += 1 / (double) i;

		System.out.printf("Series result is %,.2f%n", serie);

	}

}
