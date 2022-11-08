package DesignPattern;

public class StudentLazyInitialization {
	
	int a = 5;
	/*
	 * 
	 * 
	 * ---------Thread safe Lazy Initialization-----
	 
	 
	
	private static StudentLazyInitialization lazyInitialization;
	
	private StudentLazyInitialization() {
		
		
	}
	
	public static StudentLazyInitialization getStudentLazyInstance(){
		
		if(lazyInitialization == null) {
			
			lazyInitialization = new StudentLazyInitialization();
		}
		
		return lazyInitialization;
	}

	 
	 */
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Double Check Locking Principal--------
	 */
	
	private static StudentLazyInitialization lazyInitialization;
	
	private StudentLazyInitialization() {
		
	}
	
	public static StudentLazyInitialization getThreadSafeInstance() {
		
		if(lazyInitialization == null) {
			synchronized (StudentLazyInitialization.class) {
				
				if(lazyInitialization == null) {
					lazyInitialization = new StudentLazyInitialization();
				}
				
			}
		}
		
		return lazyInitialization;
	}
	 
	 
	 
	 
	  
	  
	  
	  
	  
	 
}
