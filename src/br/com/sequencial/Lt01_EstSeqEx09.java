package br.com.sequencial;


/*
 * Objetivo: Receba os 2 n�meros inteiros. Calcule e mostre a soma dos quadrados.
 * Autor: Victor Neves
 * Data: 9 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int number1 = input.nextInt(); // lendo primeiro n�mero

		System.out.print("Digite outro n�mero: ");
		int number2 = input.nextInt(); // lendo secundo n�mero
		input.close(); // fechando input

		// calcula soma dos quadrados
		int somaDosQuadrados = number1 * number1 + number2 * number2;

		// exibe resultado
		System.out.printf("Soma dos quadrados � %d%n", somaDosQuadrados);

	}

}
