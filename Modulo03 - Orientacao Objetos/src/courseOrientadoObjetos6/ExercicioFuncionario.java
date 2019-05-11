package courseOrientadoObjetos6;

import java.util.Locale;
import java.util.Scanner;

import courseOrientadoObjetos6.Employee;

public class ExercicioFuncionario {

	public static void main(String[] args) {
		/* Exercicio de Fixação - Programa de Nome, Salario Bruto e Imposto que 
		calcula o Salario Liquido e quantos porcentos de aumento vai ter o funcionario
		e o novo Salario */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee func = new Employee();
		
		System.out.println("Nome: ");
		func.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		func.salary = sc.nextDouble();
		
		System.out.println("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println(func.toString());
		
		System.out.println("Which porcentage to increase salary? ");
		func.porcentage = sc.nextDouble();
		
		System.out.println(func.toString1());
				
		sc.close();

	}

}
