package Static;

public class Employee {

	//Instance Variable or class level variable for Office Info.
	int id;
	String name;
	static String companyName = "Hovata";
	
	 
	//create constractor 
	Employee(int id, String name){
		
		this.id = id;
		this.name = name;
		
	}
	
	
	//Create Method for showing Information.
	
	void displayInformation() {
		System.out.println("Id: "+ id+ "\n"+"Name: "+ name + "\n"+"Comapny Name: "+ companyName+ "\n\n");
		
	}
}
