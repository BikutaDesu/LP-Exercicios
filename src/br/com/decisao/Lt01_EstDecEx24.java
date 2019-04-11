package br.com.decisao;


/*
 * Objetivo: Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3.
 *  
 * Autor: Victor Neves
 * Data: 14 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstDecEx24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro: ");
		int number = scanner.nextInt();
		scanner.close();

		if (number % 2 == 0 && number % 3 == 0)
			System.out.printf("%d � divis�vel por 2 e 3.%n", number);
		else
			System.out.printf("%d n�o � divis�vel por 2 e 3.", number);

	}

}
