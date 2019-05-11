package aula05;

public class Program {

	public static void main (String[] args) {
		// Aula 05 - Boxing, Unboxing e Wrapper Classes
		
		/* BOXING - Processo de conversao de um objeto tipo valor para um objeto 
		tipo referencia compativel;
		UNBOXING - � o processo de conversao de um objeto tipo referencia para um
		objeto tipo valor compat�vel; 
		*/
		
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		/* 
		 * WRAPPER CLASSES - S�o classes equivalentes aos tipos primitivos
		 * BOXING e UNBOXING � natural na linguagem
		 * Uso comum: campos de entidades em sistemas de informa��o (IMPORTANTE!)
		 * pois tipos de referencia(classes) aceitam valor null e usufruem de recursos OO
		 */
		
	}
}
