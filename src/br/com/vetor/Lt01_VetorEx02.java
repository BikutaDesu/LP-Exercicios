package br.com.vetor;

/*
 * Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
 * a. O maior e o menor valor;
 * b. A m�dia dos valores.
 * 
 * Autor: Victor Neves
 * Data: 22/03/2019
 */

import java.util.Scanner;

public class Lt01_VetorEx02 {

	public static void main(String[] args) {
		int[] array = new int[3];

		array = fillArray(array);
		maiorEMenor(array);
		System.out.printf("M�dia dos valores � de %,.1f", averageArray(array));
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

	public static void maiorEMenor(int[] array) {
		int smaller = array[0];
		int largest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest)
				largest = array[i];
			if (array[i] < smaller)
				smaller = array[i];
		}

		System.out.printf("O maior valor � %d%n", largest);
		System.out.printf("O menor valor � %d%n", smaller);
	}

	public static double averageArray(int[] array) {
		double average = 0;

		for (int valor : array)
			average += valor;

		average /= array.length;

		return average;
	}

}
