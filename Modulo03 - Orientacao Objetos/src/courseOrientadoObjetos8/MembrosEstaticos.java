package courseOrientadoObjetos8;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		// Aula 8 e 9 - Sobre membros Estaticos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", PI);
		
		sc.close();
	}
	
	// Não é possivel chamar um metodo STATIC dentro de outro metodo STATIC
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	// Não é possivel chamar um metodo STATIC dentro de outro metodo STATIC
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
