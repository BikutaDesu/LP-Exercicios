package br.com.repeticao;
import java.util.Scanner;

/*
 * Objetivo   : Receba um n�mero. Calcule e mostre os resultados da tabuada desse n�mero.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx34 {

	public static void main(String[] args) {

		int number;

		Scanner scanner = new Scanner(System.in);

		// Receba um n�mero
		System.out.print("Enter a integer: ");
		number = scanner.nextInt();
		scanner.close();

		// Calcula e mostra os resultados da tabuada desse n�mero
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d x %d = %d%n", number, i, number * i);

	}

}
