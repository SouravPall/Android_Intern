package DesignPattern;

public class TestStudent {

	public static void main(String[] args) {
		
		
		StudentLazyInitialization s = StudentLazyInitialization.getStudentLazyInstance();
		
		System.out.println(s.a);
		
		StudentEagerInitialization s1 = StudentEagerInitialization.getStudentInstance();
		
		System.out.println(s.a);
		
		
	}
}
