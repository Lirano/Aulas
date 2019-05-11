package courseAula11;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// Operadores Bitwise

		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		System.out.println("------------------------------------");

		Scanner sc = new Scanner(System.in);

		int mask = 32;// ou 0b00100000
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		sc.close();

	}

}
