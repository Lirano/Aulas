package courseAula03;

public class Program3 {

	public static void main(String[] args) {
		// Aula 3 - Conversão Implícita e Casting

		// exemplo 1
		double a;
		float b;

		a = 5.0;
		b = (float) a;

		System.out.println(b);
		// exemplo 2
		double a2;
		int b2;

		a2 = 5.7;
		b2 = (int) a2;

		System.out.println(b2);
		// exemplo 3
		int a3, b3;
		double result;

		a3 = 5;
		b3 = 2;

		result = (double) a3 / b3;
		System.out.println(result);
		System.out.println(b2);
		// exemplo 4
		double result4;
		String s = "33";

		result4 = Integer.parseInt(s);
		System.out.println(result4);

	}

}
