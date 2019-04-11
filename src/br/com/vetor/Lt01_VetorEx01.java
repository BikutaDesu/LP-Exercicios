package br.com.vetor;

/*
 * Objetivo: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 * 	a. A m�dia dos valores entre 10 e 200;
 * 	b. A soma dos n�meros �mpares.
 * 
 * Autor: Victor Neves
 * Data: 22/03/2019
 */

import java.util.Scanner;

public class Lt01_VetorEx01 {

	public static void main(String[] args) {
		int[] array = new int[50];

		array = fillArray(array);

		System.out.printf("M�dia dos valores entre 10 e 200 = %,.1f%n", media(array));
		System.out.printf("Soma dos n�meros �mpares = %d", sumOdd(array));

	}

	public static int[] fillArray(int[] array) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d� Valor: ", i + 1);
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}

	public static double media(int[] array) {
		double average = 0;
		double counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10 && array[i] < 200) {
				counter++;
				average += array[i];
			}
		}
		average = average / counter;

		return average;
	}

	public static int sumOdd(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				sum += array[i];
		}

		return sum;

	}

}
