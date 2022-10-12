package OOP;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		
		System.out.println("Addition: "+cal.doAddition(5, 6));
		
		System.out.println("Square: "+cal.getSquare(5));
		
		System.out.println("Substraction: "+cal.doSubtraction(5, 2));
		
		System.out.println("Multiplication: "+cal.doMultiplication(2, 3));
		
		System.out.println("Divison: "+cal.doDivison(10, 2));
		
		System.out.println("Min Function: "+ cal.minFunction(9, 6));
		
		System.out.println("Odd(1)/Even(0): "+ cal.oddEvenFunction(4));
		
	}
}
