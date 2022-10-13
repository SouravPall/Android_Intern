package This;

public class Student {

	int id;
	String name;
	String address;
	int age;
	double fee;
	
	Student(int id, String name, String address, int age) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	
	Student(int id, String name, String address, int age, double fee) {
				
			this( id, name, address, age);
			this.fee = fee;
	}



	void display() {
		System.out.println(id + " "+name + " "+address+" "+age+" "+fee);
	}
	
	
}
