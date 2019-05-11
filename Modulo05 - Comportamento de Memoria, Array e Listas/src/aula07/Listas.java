package aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		/* 
		* Aula 07 e 08 - Listas
		* Lista � uma estrutura de dados:
		* - Homog�nea (dados do mesmo tipo)
		* - Ordenada (elementos acessados por meio de posi��es)
		* - Inicia vazia, e seus elementos s�o alocados sob demanda
		* - cada elemento ocupa em "n�" (ou nodo) da lista

		* Tipo (interface): List
		*	Classes que implementam: ArrayList, LinkedList, etc.

		* Vantagens:
		*	Tamanho vari�vel
		*	Facilidade para se realizar inser��es e delega��es

		* Desvantagens:
		*	Acesso sequencial aos elementos
		*/
		
		List<String> list = new ArrayList<>(); //Declarando a lista

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Metodo de Sobrecarga - Inserindo na posi��o 2 da lista o nome Marco

		System.out.println(list.size()); // Verificando o tamanho da Lista

		for (String x : list){
			System.out.println(x);
		}

		System.out.println("-----------------------------------");
		list.remove("Anna"); // Removendo o nome Anna pela lista
		list.remove(1); // Removendo o indice 1 da lista
		list.removeIf(x -> x.charAt(0) == 'M'); // Pega um valor X que � uma String e me retorna se esse X.CHARAT(0) � igual a M
		for (String x : list){
			System.out.println(x);
		}
		System.out.println("-----------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Mostra em qual posi��o esta o BOB

		System.out.println("-----------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Filtra nomes que come�a com A e transforma novamente em lista
		for (String x : result){
			System.out.println(x);
		}

		System.out.println("-----------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Pega o primeiro nome que come�a com A
		System.out.println(name);

	}

}
