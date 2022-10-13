package This;

class XYZ{
	
	
	Test5 test5;
	
	
	XYZ(Test5 test5){
		
		this.test5 = test5;
	}
	
	
	
	void displayInfo() {
		System.out.println( test5.a );
	}
	
}


public class Test5 {
	
	int a = 5;
	
	public Test5() {
		// TODO Auto-generated constructor stub
		
	
		XYZ xyz = new XYZ(this);
		xyz.displayInfo();
	}
	
	
	
	public static void main(String[] args) {
		
		Test5 test5 = new Test5();
		
	}

}
