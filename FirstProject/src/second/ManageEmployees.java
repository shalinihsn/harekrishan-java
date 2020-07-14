package second;

import first.Department;
import first.Employee;

public class ManageEmployees extends Employee {
	public ManageEmployees(int empId, String empName, Department empDept, int e) {
		super(empId, empName, empDept);
		this.e = e;
	}

	public ManageEmployees(int e) {
		super();
		this.e = e;
	}

	int e;
	
	ManageEmployees()
	{
		System.out.println("derived class "+ManageEmployees.class.getSimpleName());
		
	}
	
	/*
	 * public static void testStatic() {
	 * System.out.println("testStatic ManageEmployees"); }
	 */

	public static void main(String[] args) {

		ManageEmployees e= new ManageEmployees();
		e.printEmployee(e);
		e.getPerson();
		Employee e1 = new ManageEmployees();
		e1.testStatic();
		e.testStatic();
		//e.getPersonData();
		//e.getEmployee();
		
	}

}
