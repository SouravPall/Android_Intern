package Encapsulation;

import java.util.Scanner;

public class Employee {

	private String empName;
	private long empACno;
	private String empEmail;
	private double empBlance;
	
	 
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpACno() {
		
		return empACno;
	}
	public void setEmpACno(long empACno) {
		this.empACno = empACno;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpBlance() {
		System.out.println("======== Employee Check =====");
		System.out.println("Please Enter your Account Name: ");
		Scanner sc = new Scanner(System.in);
		String user_name = sc.nextLine();
		
		
		System.out.println("Please Enter your Account Number: ");
		
		long ac_no = sc.nextLong();
		
		if(user_name.equals(empName) && ac_no == empACno) {
			
			System.out.println("Blance: "+empBlance+ " Tk");
			
		}
		else {
			System.out.println("Wrong AC Name or AC no. !!!");
		}
		return empBlance;
	}
	public void setEmpBlance(double empBlance) {
		this.empBlance = empBlance;
	}
	
	
	
	
}
