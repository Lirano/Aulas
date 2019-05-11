package courseAula13;

public class Program13 {

	public static void main(String[] args) {
		// Aula 13 - Functions interessantes para String

		// Formatar: toLowerCase(), toUpperCase(), trim() - Tudo minusculo, tudo
		// maiusculo e remeve espacos
		// Recortar: sustring(inicio), sustring(inicio,fim)
		// Substituir caractere ou string: Replace(char, char), Replace(string, string)
		// Buscar: IndexOf, LastIndexOf
		// str.Split("") recorta uma string conforme o parametro passado

		String original = "   abcde FGHIJ ABC abc DEFG    ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("substring: " + s04);
		System.out.println("substring: " + s05);
		System.out.println("replace: " + s06);
		System.out.println("replace: " + s07);
		System.out.println("indexOf: " + i);
		System.out.println("lastIndexOf: " + j);

		String s = "potato apple lemon";

		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
