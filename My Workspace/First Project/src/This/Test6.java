package This;




class ABCD{
	
	public ABCD getABCobj() {
		
		return this;
	}
	
	
	void dispalyInfo() {
		
		System.out.println("Method is Invoked");
	}
}



public class Test6 {

	public static void main(String[] args) {
		
		ABCD abcd = new ABCD();
		ABCD abcd1 = abcd.getABCobj();
		
		System.out.println(abcd1);
		System.out.println(abcd);
		
		abcd.dispalyInfo();
		
	}
}
