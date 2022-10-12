package OOP;

public class OverloadingCalculator {

	int result;
	float result1;
	
	int doAddition(int a, int b) {
		result = a+b;
		return result;
	}
	
	int doAddition(int a, int b, int c) {
		result = a+b+c;
		return result;
	}
	
	
	double doAddition(double a, double b) {
		return a+b;
	}
	
	void display(int a, double b) {
		System.out.println(a+b);
	}
	
	void disp(int a, int b, double c, double d) {
		System.out.println("Addition of two int value is " + (a+b));
		System.out.println("Addition of two double value is " + (c+d));
	}

	
}
