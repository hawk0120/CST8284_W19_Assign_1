package company;

import java.util.Arrays;

public class Company {

	private Employee[] employee;
	private static int numberEmployees;
	private final static int maxNumEmployees = 10;
	
	public Company() {
		Employee Alvin = new Employee("Alvin Spring", 14, new OurDate(2,12,2014), 15000.0);
		this.employee[0] = Alvin;
		System.out.println(employee[0]);
	}

	public void addEmployee(String name, int employeeNumber, OurDate startDate, double salary) {
//		for(int i = 0; i < employee.length; i++) {
//		employee[i] = new Employee(name, employeeNumber, startDate, salary);
//		}
	}
	
	public int currentNumberEmployees() {
//		int numEmployees;
//		numEmployees = employee.length;
//		return numEmployees;
	}
	
	public boolean isMaximumEmployee() {
//		if (!(numberEmployees == maxNumEmployees)) {
//			return false; 
//		} else {
//			return true;
//		}
	}
	
	public Employee[] getEmployees() {		
		
//		employee[0] = ("Alvin Spring", 14, new OurDate(2,12,2014), 150000.0);
//		employees[1] = new Employee("Grant Barge", 21, new OurDate(18,5,2009), 40000.0);
//		employees[2] = new Employee("Ross Chuttle", 23, new OurDate(22, 2, 2010), 43269.0);
		
		
		
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		} 	
		return employee;
	}
	
//	public Employee findSeniorEmployee() {
		
		
		// return;
//	}
	
	
	
	
	
	
}
