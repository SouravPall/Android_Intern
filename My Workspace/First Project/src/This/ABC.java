package This;

public class ABC {

	
	//Method 1
	void m1(){
		System.out.println("Method m1");
	}
	
	//Method 2
	void n1() {
		
		m1();
	}
	
	//main method
	
	public static void main(String[] args) {
		
		ABC abc = new ABC();
		abc.n1();
	}
}
