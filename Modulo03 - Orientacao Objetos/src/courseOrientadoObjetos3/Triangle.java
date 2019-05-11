package courseOrientadoObjetos3;

public class Triangle {

	//Aula 2 - Orientacao a Objeto
	
	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
