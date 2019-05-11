package courseAula06;

public class Program6 {

	public static void main(String[] args) {
		// Aula 6 - Operadores de Atribuicao

		double n1 = 10;
		double n2 = 30;
		String s = "A, B, C";

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);

		System.out.println("--------------------------------------");

		n1 *= 2; // 20
		n2 += n1; // 30 + 20 = 50
		s += ", D, E, F";

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);

		System.out.println("--------------------------------------");

		int a = 10;
		int b = a++;
		System.out.println(a);
		System.out.println(b);

		System.out.println("--------------------------------------");

		int a1 = 10;
		int b1 = ++a1;
		System.out.println(a1);
		System.out.println(b1);

	}

}
