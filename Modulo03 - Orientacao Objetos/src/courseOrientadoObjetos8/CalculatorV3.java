package courseOrientadoObjetos8;

public class CalculatorV3 {
	
	/* Colocando o metodo STATIC, estamos falando que PI é uma monstante que independe
	de qualquer objeto do tipo CALCULATOR, do mesmo modo que as classes CIRCUMFERENCE
	e VOLUME */
	
	public static final double PI = 3.14159;

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}

}
