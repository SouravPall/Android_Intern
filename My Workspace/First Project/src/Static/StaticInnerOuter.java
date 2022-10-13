package Static;

public class StaticInnerOuter {

	
	static int x = 10;
	
	static class Inner{
		
		
		//method 
		static void msg() {
			System.out.println(x);
		}
		
	}
	
	//main method
	public static void main(String[] args) {
		
		
		//Create Object
		//StaticInnerOuter innerOuter = new StaticInnerOuter();
		
		
		//Inner Class object create
		//StaticInnerOuter.Inner inner = new StaticInnerOuter.Inner();
		
		StaticInnerOuter.Inner.msg();
	}
	
}
