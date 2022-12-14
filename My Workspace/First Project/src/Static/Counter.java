package Static;

public class Counter {
	
	//Instance Variable
	//int count = 0;
	
	//static variable
	static int count = 0;
	
	
	//Constructor 
	Counter(){
		count++;
	}
	
	//Method, no return type (void)
	void getCount(){
		System.out.println("The Values of Count is " + count);
	}
	
	
	//Main Method
	public static void main(String[] args) {
		
		//Object Create 
		Counter c1 = new Counter();
		c1.getCount();  //calling "getCount()" method
		
		//new object create 
		Counter c2 = new Counter();
		c2.getCount();//calling "getCount()" method
		
		// Another object create
		Counter c3 = new Counter();
		c3.getCount();
	}

}
