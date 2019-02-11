package company;

import java.util.Scanner;

public class CompanyConsole {

	private final static int  addEmployee = 1;
	private final static int displayEmployee = 2;
	private final int displaySeniorEmployee = 3;
	private final static int exit = 9;
	private Company startUp;
	private Scanner sc = new Scanner(System.in);
	private static Employee[] employees;	
	
	public CompanyConsole() {
		//constructor
		this.menu();
		
		
	}
	

	public void menu() {
		
	}
	
	private void addEmployee() {
		
	}
	
	private void displayEmployee() {
		
	}
	
	private void displaySeniorEmployee() {
		
	}

	public static void main(String[] args) {	
		Company company = new Company();
		company.getEmployees();
		
//		for (int i = 0; i < employees.length; i++) {
//			System.out.println(employees[i]);
//		} 		
	}

}
