/* 
 * Autor: Victor Neves
 * 
 * Enunciado: Criar um procedimento que receba um numero inteiro e mostre a
 * sequência Fibonacci no próprio método
 * 
 */

package br.com.exp1;

public class P1_Ex02 {
	
	public static void mostrarSequenciaFibonacci(int pos) {
		if (pos < 0) {
			System.out.println("Número Inválido, por favor informe um número maior que 0");
		}else if(pos == 0) {
			System.out.println("Sequência: 0");
		}else if(pos == 1) {
			System.out.println("Sequência: 0 - 1");
		}else {
			String strSequencia = "0 - 1";
			int ant = 0;
			int prox = 1;
			for(int i = 2; i <= pos; i++) {
				int r = ant + prox;
				ant = prox;
				prox = r;
				strSequencia += " - " + r ;
			}
			strSequencia += ".";
			System.out.printf("Sequência: %s \n", strSequencia);
		}
	}
	
}
