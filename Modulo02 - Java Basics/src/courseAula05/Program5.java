package courseAula05;

public class Program5 {

	public static void main(String[] args) {
		// Aula 5 - Operadores Aritmeticos

		int n1 = 3 + 4 * 2;
		int n2 = (3 + 7) * 2;
		int n3 = 17 % 3;
		double n4 = (double) 10 / 8; // OU double n4 = 10.0 / 8;

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

		// Exemplo 2
		double a = 1.0, b = -3.0, c = -4.0;
		double x = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);

		System.out.println(x);

	}

}
