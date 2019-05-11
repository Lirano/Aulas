package aula03;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// Aula 03 - Exercicio sobre VETOR
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);;
		
		System.out.print("How many position has? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i=0; i<n; i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			
		}
		
		double sum = 0.0;
		
		for (int i=0; i<vect.length; i++) { //VECT.LENGTH -> O VETOR SABE O PROPRIO TAMANHO
			
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}

}
