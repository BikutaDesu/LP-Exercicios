package br.com.decisao;


/*
 * Objetivo: Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor.
 * 
 * Autor: Victor Neves
 * Data: 15 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstDecEx26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		int number1 = scanner.nextInt();

		System.out.print("Digite outro inteiro: ");
		int number2 = scanner.nextInt();
		scanner.close();

		// Verifique e mostre se o maior n�mero � m�ltiplo do menor
		if (number1 > number2) {

			if (number1 % number2 == 0)
				System.out.printf("%d � multiplo do %d", number1, number2);
			else
				System.out.printf("%d � n�o multiplo do %d", number1, number2);

		} else {

			if (number2 % number1 == 0)
				System.out.printf("%d � multiplo do %d", number2, number1);
			else
				System.out.printf("%d � n�o multiplo do %d", number1, number2);

		}
	}

}
