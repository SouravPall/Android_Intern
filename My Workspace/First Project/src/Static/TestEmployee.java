package Static;

public class TestEmployee {

	//Create main method
	public static void main(String[] args) {
		
		//Create Employee Object
		Employee employee1 = new Employee(101, "Sourav");
		Employee employee2 = new Employee(102, "Mr.Paul");
		
		// Calling Display Mathord 
		
		employee1.displayInformation();
		employee2.displayInformation();
		
		Employee.setCompanyName("Hovata Tech");
		
		Employee employee3 = new Employee(103, "Mark");
		Employee employee4 = new Employee(104, "Lisha");
		
		employee3.displayInformation();
		employee4.displayInformation();
		
		System.out.println(employee1.id);
		System.out.println(Employee.companyName);
		
		
	}
}
