package company;


public class Employee {
	private String name;
	private int employeeNumber;
	private OurDate startDate;
	private double salary;
	
	
	public Employee() {
		this("unknown", -9, new OurDate(), 1);
	}
	
	public Employee(String name, int employeeNumber, OurDate startDate, double salary) {
		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setStartDate(startDate);
		this.setSalary(salary);
	}
	
	public String getName() {
		return name;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	
	public OurDate getStartDate() {
		return startDate;
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	private void setStartDate(OurDate startDate) {
		this.startDate = startDate;
	}
	
	private void setSalary(double salary) {
		this.salary = salary;
	}
	
@Override
	public String toString() {
		return name + " " + employeeNumber + " " + startDate + " " + salary;				
	}
	
@Override	
	public boolean equals(Object obj) {
	if(obj == this) {
		return true;
	}	else  if (!(obj instanceof OurDate)) {
		return false;
	} else { 
		return false;
	}			
	}
	
}
