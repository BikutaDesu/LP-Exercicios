/* 
 * Autor: Victor Neves
 * 
 * Enunciado: Receber um valor positivo maior que 0, 
 * caso contr�rio emitir uma mensagem de erro e coletar o valor at� ser v�lido
 * ap�s isso chamar uma fun��o recursiva que recebe o valor e retorne a soma da s�rie
 * 1/(n) + 3/(n-1) + 5/(n-2) + ... + x/(n=1)
 * 
 */

package br.com.exp1;

import java.util.Scanner;

public class P1_Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("S�rie - 1/(n) + 3/(n-1) + 5/(n-2) + ... + x/(n=1)");
		System.out.println("Digite um valor de termos maior que 0");
		int valor;
		do {
			System.out.print("Valor: ");
			valor = sc.nextInt();
			if (valor <= 0) {
				System.out.println("Digite um valor v�lido...");
			}
		} while (valor <= 0);
		System.out.printf("Resultado da s�rie: %.0f", serieRecursiva(1, valor));
	}
	
	static float serieRecursiva(int x, int n) {
		if (n == 0) {
			return 0;
		}else {
			return (x / n) + serieRecursiva(x+2, n-1);
		}
	}

}
