package courseAula12;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		// Estruturas Condicionais

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number: ");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even!");
		} else {
			System.out.println("Odd!");
		}

		System.out.println("---------------------------------------");
		// Exemplo agora com condicao encadeada

		System.out.println("What time is it?");
		int time = sc.nextInt();

		if (time < 12) {
			System.out.println("Good Morning!");
		} else if (time >= 12 && time < 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}

		sc.close();

	}

}
