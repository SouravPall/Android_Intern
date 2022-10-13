package This;

public class Test4 {

	
	
	void m1(Test4 test4) {
		System.out.println("m1 method is invoked");
		
	}
	
	void n1() {
		m1(this);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Test4 test4 = new Test4();
		test4.n1();
	}
	
	
	
	

	
	
}
