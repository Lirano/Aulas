package courseOrientadoObjetos5;

import java.util.Locale;
import java.util.Scanner;

import courseOrientadoObjetos5.Rectangle;

public class ExercicioRetangulo {

	public static void main(String[] args) {
		// Exercicio de Fixação para calcular a Area, Perimetro e Diagonal de um Retangulo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter Rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.println(rectangle);
		
		sc.close();

	}

}
