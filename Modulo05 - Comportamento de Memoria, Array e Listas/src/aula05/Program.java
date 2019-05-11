package aula05;

public class Program {

	public static void main (String[] args) {
		// Aula 05 - Boxing, Unboxing e Wrapper Classes
		
		/* BOXING - Processo de conversao de um objeto tipo valor para um objeto 
		tipo referencia compativel;
		UNBOXING - É o processo de conversao de um objeto tipo referencia para um
		objeto tipo valor compatível; 
		*/
		
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		/* 
		 * WRAPPER CLASSES - São classes equivalentes aos tipos primitivos
		 * BOXING e UNBOXING é natural na linguagem
		 * Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
		 * pois tipos de referencia(classes) aceitam valor null e usufruem de recursos OO
		 */
		
	}
}
