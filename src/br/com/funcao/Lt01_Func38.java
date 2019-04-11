package br.com.funcao;
import java.util.Scanner;

/*
 * Objetivo     : 38. Receba 100 n�meros inteiros reais. Verifique e mostre o maior e o menor
 * valor. Obs.: somente valores positivos.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func38 {

	public static void main(String[] args) {
		System.out.println(maiorMenor());
	}

	public static String maiorMenor() {
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

		return String.format("Largest is %,.2f%nSmaller is %,.2f", largest, smaller);

	}

}
