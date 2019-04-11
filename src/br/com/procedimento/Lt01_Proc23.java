package br.com.procedimento;

/*
 * Objetivo     : 23. Receba 3 valores obrigatoriamente em ordem crescente e um 4� valor n�o necessariamente em ordem. 
 * Mostre os 4 n�meros em ordem crescente
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 7 de mar de 2019
 */

import java.util.Scanner;

public class Lt01_Proc23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("- Aten��o! Insira 3 valores obrigatoriamente em ordem crescente.");

		System.out.print("Digite o 1� valor: ");
		int number1 = input.nextInt();

		System.out.print("Digite o 2� valor: ");
		int number2 = input.nextInt();

		System.out.print("Digite o 3� valor: ");
		int number3 = input.nextInt();

		if (number1 < number2 && number2 < number3) {
			System.out.print("Digite o 4� valor (n�o necessiariamente em ordem): ");
			int number4 = input.nextInt();

			ordemCrescente(number1, number2, number3, number4);
		} else
			System.err.println("Exception: valores n�o est�o em ordem crescente!");

		input.close();
	}

	public static void ordemCrescente(int number1, int number2, int number3, int number4) {
		if (number4 <= number1)
			System.out.printf("Ordem crescente: %d, %d, %d, %d.", number4, number1, number2, number3);
		else if (number4 <= number2)
			System.out.printf("Ordem crescente: %d, %d, %d, %d.", number1, number4, number2, number3);
		else if (number4 <= number3)
			System.out.printf("Ordem crescente: %d, %d, %d, %d.", number1, number2, number4, number3);
		else
			System.out.printf("Ordem crescente: %d, %d, %d, %d.", number1, number2, number3, number4);

	}

}
