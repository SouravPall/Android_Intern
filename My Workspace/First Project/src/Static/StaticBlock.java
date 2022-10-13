package Static;

public class StaticBlock {
	
	
	//static variable
	
	static int x = m1();
	
	//static block
	static {
		System.out.println("From Static Block");
	}
	
	
	//static method
	 static int m1() {
		System.out.println("from method");
		return 10;
	}
	
	
	
	//main method
	
	public static void main(String[] args) {
		System.out.println("From main method");
	
		System.out.println("The Values of x is "+ x);
	}
}
