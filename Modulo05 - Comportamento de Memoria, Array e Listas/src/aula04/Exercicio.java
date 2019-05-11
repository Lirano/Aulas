package aula04;

import java.util.Scanner;

import java.text.ParseException;

public class Exercicio {

	public static void main(String[] args) throws ParseException {
		// Aula 04 - Exercicio sobre Vetores
		
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10]; // Declara a quantidade do vetor
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();	
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Student(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
