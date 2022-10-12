package OOP;

public class Student {
	
		String name, gender, dept;
		int id;
		
		
		
		
		void setinformation(Student st ) {
			
			id = st.id;
			name = st.name;
			gender = st.gender;
			dept = st.dept;
		}
		
		void setInfo(int id, String n, String g, String d) {
			
			this.id = id;
			name = n;
			gender= g;
			dept = d;
		}
		
		
		void displayInfo(){
			
			System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Gender: "+gender+"\n"+ "Dept: "+ dept);
		}

}
