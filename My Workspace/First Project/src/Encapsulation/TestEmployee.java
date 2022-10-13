package Encapsulation;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		
		// Employee Name access
		e1.setEmpName("Sourav Paul");
		e1.getEmpName();
		
		
		//Employee AC no access
		e1.setEmpACno(17201030);
		e1.getEmpACno();
		
		//Employee Email access
		e1.setEmpEmail("souravpaul.mailme@gmail.com");
		e1.getEmpEmail();
		
		
		//Employee Blance access
		e1.setEmpBlance(25000.00);
		e1.getEmpBlance();
		
		
		
	}
	
}
