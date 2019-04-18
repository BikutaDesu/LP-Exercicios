/* 
 * Autor: Victor Neves
 * 
 * Enunciado: Criar uma função que receba e retorne o vetor carregado
 * somente com valores de 1 a 400, demais valores deverão ser despresados,
 * iformar e completar os 300 valores válidos
 * 
 */

package br.com.exp1;

import java.util.Random;

public class P1_Ex01 {

	public static int[] carregarVetor(int tamVetor, int valorMax) {
		int[] vetor = new int[tamVetor];
		Random random = new Random();
		for(int i = 0; i < tamVetor; i++) {
			vetor[i] = random.nextInt(valorMax);
		}
		return vetor;
	}

}
