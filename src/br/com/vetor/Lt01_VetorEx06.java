package br.com.vetor;

/*
 * Objetivo: Criar e coletar em um vetor [20] com n�meros aleat�rios. Classificar este vetor em ordem crescente e mostre os dados.
 * 
 * Autor: Victor Neves
 * Data: 23/03/2019
 */

import java.security.SecureRandom;

public class Lt01_VetorEx06 {

	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int[] array = new int[20];

		array = fillArray(array);
		array = bubbleSort(array);
		displayArray(array);

	}

	public static int[] fillArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(21);
			System.out.println(i + 1 + "� = " + array[i]);
		}
		return array;
	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		return array;
	}

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.printf("%d.", array[i]);
			else
				System.out.printf("%d, ", array[i]);

		}
	}

}
