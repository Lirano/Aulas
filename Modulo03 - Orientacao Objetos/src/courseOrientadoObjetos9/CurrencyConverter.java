package courseOrientadoObjetos9;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double price, double value) {
		return price * value * (1 + IOF);
	}

}
