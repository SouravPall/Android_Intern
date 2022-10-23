package DesignPattern;

public class StudentLazyInitialization {
	
	int a = 5;
	
	private static StudentLazyInitialization lazyInitialization;
	
	private StudentLazyInitialization() {
		
		
	}
	
	public static StudentLazyInitialization getStudentLazyInstance(){
		
		if(lazyInitialization == null) {
			
			lazyInitialization = new StudentLazyInitialization();
		}
		
		return lazyInitialization;
	}

}
