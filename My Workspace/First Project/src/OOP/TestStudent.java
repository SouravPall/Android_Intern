package OOP;

public class TestStudent {
	public static void main(String[] args) {
		
		Student st = new Student();
		
		
		st.setInfo(29, "Sourav Paul", "Male", "CSE");
		st.displayInfo();
		
		
		Student st1 = new Student();
		
		st1.setinformation(st);
		st.displayInfo();
	}

}
