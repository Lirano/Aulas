package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import encapsulamento.MetodoEncapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		/* Aula 4 - Sobrecarga � o principio de esconder detalhes de implementa��o de
		uma classe, expondo apenas opera��es seguras e que mantem os objetos em um estado
		consistente */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		MetodoEncapsulamento product = new MetodoEncapsulamento();
		
		product.setName("Computador");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
		
		
	}

}
