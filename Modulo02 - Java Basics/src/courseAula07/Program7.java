package courseAula07;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// Aula 7 - Entrada de Dados em Java

		// Ler um texto ate a quebra de linha e armazenar em uma variavel

		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();

		System.out.println(sentence);

		// Ler tres palavras, uma em cada linha, armazenando cada uma em uma variavel

		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		// Ler tres palavras na mesma linha, separadas por espaco, armazenando cada uma
		// em uma variavel

		x = sc.next();
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}

}
