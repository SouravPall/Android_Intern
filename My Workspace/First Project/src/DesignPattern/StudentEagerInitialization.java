package DesignPattern;

public class StudentEagerInitialization {
	
	int a = 5;

	//----------Static Aproach
	private static StudentEagerInitialization Student_obj;
	
	private StudentEagerInitialization() {
		
		
	}
	
	static {
		
		try {
			Student_obj = new StudentEagerInitialization();
			
		}
		catch(Exception e){
			throw new RuntimeException("Exception occured is creating the instance");
			
		}
		
		
		
		Student_obj = new StudentEagerInitialization(); 
	}
	
	
	
	
	
	
	public static StudentEagerInitialization getStudentInstance() {
		return Student_obj;
	}
	
}
