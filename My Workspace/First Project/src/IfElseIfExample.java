
public class IfElseIfExample {
	public static void main(String[] args) {
		
		
		int marks = 67;
		char grade;
		
		if(marks>70) {
			grade = 'A';
		}
		else if(marks>=60) {
			grade = 'B';
		}
		else if(marks>= 50) {
			grade = 'c';
		
		}
		else if(marks>=40) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Your Grade is "+"'" +grade +"'" );
	}
}
