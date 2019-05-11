package aula09;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		/* 
		 * Aula 09 - Matrizes - Em programação, "matriz" é um nome dado a arranjos bidimensionais
		 * 	ATENÇÃO: "Vetor de Vetores"
		 * 
		 * Arranjo (Array) é uma estrutura de dados:
		 * 	Homogênea (dados do mesmo tipo)
		 * 	Ordenada (Elementos acessados por meio de posições)
		 * 	Alocada de uma vez só, em um bloco contiguo de memoria
		 * 
		 * VANTAGENS:
		 * 	Acesso imediato aos elementos pela sua posição
		 * 
		 * DESVANTAGENS:
		 * 	Tamanho fixo
		 * 	Dificuldade para se realizar inserções e deleções
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];// Declarando a matriz, os Colchetes que mostram que é um arranjo bidemensional
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Verificando a diagonal Principal
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		// Verificando quantidade de numeros negativos
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0 ) {
					count ++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		sc.close();
	}

}
