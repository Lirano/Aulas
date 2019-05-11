package courseAula14;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		// Aula 14 - Alternative sintaxe Switch-Case

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String day;

		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thusday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "saturday";
			break;
		default:
			day = "Invalid value";
		}

		System.out.println("Day: " + day);

		sc.close();

	}

}
