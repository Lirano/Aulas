package courseAula15;

public class Program15 {

	public static void main(String[] args) {
		// Aula 15 - Expressoes condicional Ternaria

		// Estrutura opcional ao IF/Else quando se deseja decidir um VALOR com base em
		// uma condicao
		// Sintaxe: (CONDICAO) ? valor_se_verdadeiro : valor_se_falso
		// Exemplo: ( 2 > 5 ) ? 50 : 80;

		// Exemplo com IF - ELSE
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
			System.out.println(desconto);
		} else {
			desconto = preco * 0.05;
			System.out.println(desconto);
		}

		// Exemplo com expressao condicional
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20) ? preco2 * 0.1 : preco2 * 0.05;
		System.out.println(desconto2);

	}

}