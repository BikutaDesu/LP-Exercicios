package br.com.repeticao;
import java.util.Scanner;

/*
 * Objetivo   : Receba 2 n�meros inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx35 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1;
		int number2;
		int sumOdd = 0; // somat�ria dos n�meros impares
		int largest; // maior n�mero
		int smaller; // menor n�mero

		// Receba 2 n�meros inteiros
		System.out.print("Enter the first number: ");
		number1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		number2 = scanner.nextInt();
		scanner.close();

		// determina qual o maior
		if (number1 > number2) {
			largest = number1;
			smaller = number2;
		} else {
			largest = number2;
			smaller = number1;
		}
		
		// calcula somat�ria dos n�meros �mpares entre esses valores
		for (int i = largest - 1; i > smaller; i--) {
			if (i % 2 == 1)
				sumOdd += i;
		}

		System.out.printf("The result of the sum of the odd numbers between %d and %d is %d", number1, number2, sumOdd);

	}

}
