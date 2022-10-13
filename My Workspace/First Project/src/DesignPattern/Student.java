package DesignPattern;

public class Student {
	
	int a = 5;

	private static final Student STUDENT_OBJ = new Student();
	
	private Student(){
		
	}
	
	public static Student getStudentInstance() {
		return STUDENT_OBJ;
	}
	
}
