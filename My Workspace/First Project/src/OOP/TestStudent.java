package OOP;

public class TestStudent {
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.name = "Sourav Paul";
		st.gender = "Male";
		st.id= 29;
		st.dept = "CSE";
		
		
		System.out.println("Name: "+st.name+"\n"+ "Gender: "+st.gender+"\n"+ "ID: "+st.id + "\n"+ "Dept: "+st.dept);
		
		
	}

}
