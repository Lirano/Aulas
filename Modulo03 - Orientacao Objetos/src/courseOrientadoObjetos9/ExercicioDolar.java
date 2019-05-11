package courseOrientadoObjetos9;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDolar {

	public static void main(String[] args) {
		/* Exercicio de Fixação - Criando um programa para ler a cotação do dolar e
		depois o valor em dolares a ser comprado */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought: ");
		double value = sc.nextDouble();
		
		double c = CurrencyConverter.converter(price, value);
		
		System.out.printf("Amount to be paid in reais: $%.2f%n ", c);
		

		sc.close();
	}

}
