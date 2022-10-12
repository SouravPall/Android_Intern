package OOP;

public class Calculator {
	
	//Instance Variable or class level variable
	int x;
	int y;
	int result;
	int even = 0;
	int odd = 1;
	
	int doAddition(int a, int b) {
		
		
		
		result = a+b;
		return result;
	}
	
	int getSquare(int x){
		
		return x*x;
	}
	
	int doSubtraction(int a, int b) {
		return a-b;
	}
	
	int doMultiplication(int a, int b) {
		return a*b;
	}
	
	int doDivison(int a, int b) {
		return a/b;
	}
	
	int minFunction(int a, int b) {
		
		if(a<b)
		return a;
		else return b;
	}
	
	int oddEvenFunction(int a) {
		if(a%2==0) {
			return even;
		}
		else {
			return odd;
		}
	}
}
