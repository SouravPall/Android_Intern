package DesignPattern;

public class TestStudent {

	public static void main(String[] args) {
		
		
		StudentLazyInitialization s = StudentLazyInitialization.getThreadSafeInstance();
		
		System.out.println(s.a);
		
		
		
		
	}
}
