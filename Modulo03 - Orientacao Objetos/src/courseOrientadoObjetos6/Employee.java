package courseOrientadoObjetos6;

public class Employee {
	
	public double salary;
	public double tax;
	public double porcentage;
	public String name; 
	
	public double liquidSalary() {
		
		return (salary - tax);
		
	}
	
	public double increaseSalary() {
		
		return (((porcentage/100) * salary)+ liquidSalary());
				
	}
	
	
	public String toString() {
		return "Employee: " + name + ", " + String.format("%.2f", liquidSalary());
	}
	
	public String toString1() {
		return "Updated data: " + name + ", " + String.format("%.2f", increaseSalary());
	}

}
