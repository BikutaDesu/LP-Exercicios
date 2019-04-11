package br.com.vetor;

/*
 * Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
 * a. A m�dia do grupo;
 * b. A quantidade de notas acima do grupo;
 * c. As posi��es dos valores abaixo da m�dia do grupo.
 * 
 * Autor: Victor Neves
 * Data: 23/03/2019
 */

import java.util.Scanner;

public class Lt01_VetorEx04 {

	public static void main(String[] args) {

		double[] array = new double[30];

		array = fillArray(array);

		double average = averageArray(array);

		System.out.printf("M�dia do grupo = %,.1f%n", average);
		System.out.printf("Quantidade de notas acima = %d%n", aboveAverage(array, average));
		displayBelowAverage(array, average);

	}

	public static double[] fillArray(double[] array) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Valor para posi��o %d: ", i);
			array[i] = scanner.nextInt();
		}
		scanner.close();

		return array;
	}

	public static double averageArray(double[] array) {
		double average = 0;

		for (int i = 0; i < array.length; i++)
			average += array[i];

		average /= array.length;

		return average;
	}

	public static int aboveAverage(double[] array, double average) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > average)
				counter++;
		}

		return counter;
	}

	public static void displayBelowAverage(double[] array, double average) {
		System.out.print("Posi��es dos valores abaixo da m�dia = ");

		for (int i = 0; i < array.length; i++) {
			if (array[i] < average)
				System.out.print(i + " ");

		}
	}
}
