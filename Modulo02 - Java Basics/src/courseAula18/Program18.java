package courseAula18;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		// Aula 18 - Debuggin

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt(); // CTRL + SHIFT + B - Marca o ponto onde vai comecar o Debugin a rodar

		int higher = max(a, b, c);

		showResult(higher);

		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
