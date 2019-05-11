package courseOrientadoObjetos8;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticosV3 {

	public static void main(String[] args) {
		// Aula 8 e 9 - Sobre membros Estaticos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = CalculatorV3.circumference(radius);

		double v = CalculatorV3.volume(radius);

		System.out.printf("Circumference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", CalculatorV3.PI);

		sc.close();

	}

}
