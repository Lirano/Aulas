package courseAula04;

import java.util.Locale;

public class Program4 {

	public static void main(String[] args) {
		// Aula 4 -Saída de Dados em Java

		System.out.println("Good morning"); // ln no final quebra linha
		System.out.println("Good afternoon");// se ele não quebra
		System.out.println("Good night"); // se digitar sysout e apertar ctrl+space ele auto complet
		System.out.println("-----------------------");

		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";

		System.out.printf("%.2f%n", balance);// printf é para formatar numero
		System.out.printf("%.4f%n", balance);// %n quebra de linha em Java

		Locale.setDefault(Locale.US); // Passa a imprimir o nome com ponto ao inves de virgula
		System.out.printf("%.2f%n", balance);
		System.out.println("-----------------------");
		System.out.printf("%s is %d years old, gender %c and got balance = %2f bitcoins%n", name, age, gender, balance);

	}

}
