package courseOrientadoObjetos5;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double areaRetangle() {
		return (width * height);
	}
	
	public double perimeterRetangle() {
		return ((width + height)*2);
	}

	public double diagonalRetangle() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		
	}
	
	public String toString() {
		return "AREA = " 
				+ String.format("%.2f", areaRetangle()) 
				+"\nPERIMETER = " 
				+ String.format("%.2f", perimeterRetangle()) 
				+"\nDIAGONAL = " 
				+ String.format("%.2f", diagonalRetangle());
	}

}
