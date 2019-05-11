package courseOrientadoObjetos3;

import java.util.Locale;
import java.util.Scanner;

import courseOrientadoObjetos3.Triangle; //Importa a classe Tringle

public class Program3 {

	public static void main(String[] args) {
		// Aula 3 - Melhorando o exercicio da Aula 2 colocando o calculo da area na
		// classe Triangle

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();// Para utilizar a classe deve ser instanciado o objeto
		y = new Triangle();

		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();// x.a - b - c - mostra em qual atributo que sera colocado o valor informado
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		sc.close();

	}

}

/*
 * Quais os beneficios de se calcular a area de um triangulo por meio de um
 * METODO dentro da CLASSE Triangle? 1 - REAPROEITAMENTO DE CODIGO: eliminamos o
 * codigo repetitivo (calculo das areas dos triangulos x e y) no programa
 * principal. 2 - DELEGACAO DE RESPONSABILIDADE: quem deve ser responsavel por
 * saber como calcular a area de um triangulo e o proprio triangulo. A logica do
 * calculo da area nao deve estar em outro lugar
 */