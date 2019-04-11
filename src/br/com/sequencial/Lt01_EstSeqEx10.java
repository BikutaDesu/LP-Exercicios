package br.com.sequencial;


/*
 * Objetivo: Receba 2 n�meros reais. Calcule e mostre a diferen�a desses valores.
 * @author Victor Neves
 * @date 9 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double number1;
		double number2;

		System.out.print("Digite um n�mero real: ");
		number1 = scanner.nextDouble();

		System.out.println("Digite outro n�mero real: ");
		number2 = scanner.nextDouble();
		scanner.close();

		double diferenca = number1 - number2;

		System.out.printf("Diferen�a = %,.f", diferenca);

	}

}
