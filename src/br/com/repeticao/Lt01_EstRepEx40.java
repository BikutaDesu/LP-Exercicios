package br.com.repeticao;
import java.util.Scanner;

/*
 * Objetivo   : Receba 2 n�meros inteiros. Verifique e mostre todos
 * os n�meros primos existentes entre eles.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx40 {
	private enum Status {
		YES, NO
	};

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1, number2;
		int largest; // armazena maior n�mero
		int smaller; // armazena menor n�mero
		Status primo = Status.YES;

		// Receba 2 n�meros inteiros
		System.out.print("Digite um n�mero inteiro: ");
		number1 = scanner.nextInt();

		System.out.print("Digite outro n�mero inteiro: ");
		number2 = scanner.nextInt();
		scanner.close();

		// identifica qual o maior e menor
		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}

		// Verifique e mostre todos os n�meros primos existentes entre eles
		System.out.print("\nPrimos Entre os N�meros Digitados: ");
		for (int i = smaller + 1; i < largest; i++) {

			// verica se i � primo
			double root = Math.sqrt(i);
			for (int j = 2; j <= root; j++) {
				if (i % j == 0) {
					primo = Status.NO;
					break; // para o loop
				}
			}

			if (primo == Status.YES && i != 1)
				System.out.printf("%d ", i);

			primo = Status.YES;

		}
	}

}
