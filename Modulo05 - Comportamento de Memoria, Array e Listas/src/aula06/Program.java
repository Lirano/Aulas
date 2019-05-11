package aula06;

public class Program {

	public static void main (String[] args) {
		/* 
		 * Aula 06 - La�o FOR EACH
		 * Sintaxe opcional e simplificada para percorrer cole��es
		 */
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
