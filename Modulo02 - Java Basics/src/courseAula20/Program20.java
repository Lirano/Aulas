package courseAula20;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		// Aula 20 - Estruturas de Repeticao FOR

		Scanner sc = new Scanner(System.in);

		System.out.print("How many integer numbers are you going to enter: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + 1);
			int x = sc.nextInt();
			sum += x;

		}
		System.out.println("Sum = " + sum);

		sc.close();

	}

}
