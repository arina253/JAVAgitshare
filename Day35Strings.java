package gitshare;

import java.util.Arrays;
import java.util.List;

public class Day35Strings {

	public static void main(String[] args) {
		
		Employee [] employees = {
				new Employee(1,"ram joshi", 100),
				new Employee (2, "sam shrestha", 1000),
				new Employee (3,"gopal rai", 10000)
				};
		
		for (int i = 0; i < employees.length;i++) {
			employees[i].displayFullName();
		}
		
		//STRING METHODS

		
		List <Employee>emplist = Arrays.asList(employees);
		
		//forEach()
		
		emplist.stream().forEach (emp -> emp.incrementSalary(100));
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);
		}
	}

}


class Employee{
	int id;
	String fullName;
	int salary;
	
	public Employee ( int id, String fn, int sy) {
		this.id = id;
		this.fullName = fn;
		this.salary = sy;
	}
	
	public void displayFullName() {
		System.out.println(this.fullName);
	}
	
	public void incrementSalary(int x) {
		this.salary = this.salary + x;
		//this.salary += x;
		
	}
}



