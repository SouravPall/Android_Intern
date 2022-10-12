package Static;

public class TestEmployee {

	//Create main method
	public static void main(String[] args) {
		
		//Create Employee Object
		Employee employee = new Employee(101, "Sourav");
		Employee employee2 = new Employee(102, "Mr.Paul");
		
		// Calling Display Mathord 
		
		employee.displayInformation();
		employee2.displayInformation();
		
	}
}
