

import java.util.Scanner;
public class Calculator {
	
	

	public static void main(String[] args) {
		
//		float a = 20;
//		float b = 6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		float a = sc.nextFloat();
		System.out.println("Enter Second Number: ");
		float b = sc.nextFloat();
		
		float addition = a + b;
		float substraction = a - b;
		float multiplication = a * b;
		float division = a/ b;
		
		System.out.println("Addition: "+ addition);
		System.out.println("Substraction: "+ substraction);
		System.out.println("Multiplication: "+ multiplication);
		System.out.println("Division: "+ division);
	}
}
