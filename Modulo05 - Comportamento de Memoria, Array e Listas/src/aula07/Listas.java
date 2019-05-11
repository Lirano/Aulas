package aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		/* 
		* Aula 07 e 08 - Listas
		* Lista é uma estrutura de dados:
		* - Homogênea (dados do mesmo tipo)
		* - Ordenada (elementos acessados por meio de posições)
		* - Inicia vazia, e seus elementos são alocados sob demanda
		* - cada elemento ocupa em "nó" (ou nodo) da lista

		* Tipo (interface): List
		*	Classes que implementam: ArrayList, LinkedList, etc.

		* Vantagens:
		*	Tamanho variável
		*	Facilidade para se realizar inserções e delegações

		* Desvantagens:
		*	Acesso sequencial aos elementos
		*/
		
		List<String> list = new ArrayList<>(); //Declarando a lista

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Metodo de Sobrecarga - Inserindo na posição 2 da lista o nome Marco

		System.out.println(list.size()); // Verificando o tamanho da Lista

		for (String x : list){
			System.out.println(x);
		}

		System.out.println("-----------------------------------");
		list.remove("Anna"); // Removendo o nome Anna pela lista
		list.remove(1); // Removendo o indice 1 da lista
		list.removeIf(x -> x.charAt(0) == 'M'); // Pega um valor X que é uma String e me retorna se esse X.CHARAT(0) é igual a M
		for (String x : list){
			System.out.println(x);
		}
		System.out.println("-----------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Mostra em qual posição esta o BOB

		System.out.println("-----------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Filtra nomes que começa com A e transforma novamente em lista
		for (String x : result){
			System.out.println(x);
		}

		System.out.println("-----------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Pega o primeiro nome que começa com A
		System.out.println(name);

	}

}
