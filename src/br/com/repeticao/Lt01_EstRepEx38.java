package br.com.repeticao;
import java.util.Scanner;

/*
 * Objetivo   : Receba 100 n�meros inteiros reais. 
 * Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double largest = 0;
		double smaller = 0;

		for (int i = 0; i < 100;) {
			System.out.printf("Digite o %d� n�mero: ", i + 1);
			double number = scanner.nextDouble();

			if (number < 0.0) // Obs.: somente valores positivos
				System.out.println(" - Oops! insira somente n�meros posivitos. Tente novamente!");
			else {
				if (i == 0) { // primeiro n�mero digitado vai para largest e smaller
					largest = number;
					smaller = number;
				} else {
					if (number > largest)
						largest = number;
					else if (number < smaller)
						smaller = number;
				}
				i++;
			}
		}
		scanner.close();

		// exibe o maior e o menor valor
		System.out.printf("Largest is %,.2f%nSmaller is %,.2f", largest, smaller);

	}
}