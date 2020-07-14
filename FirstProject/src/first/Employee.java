package first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Person implements Serializable{
	
	private int empId;
	private String empName;
	protected static String empNationality;
	transient Department empDept;
	
	
	protected void printEmployee(Employee e)
	{
		System.out.println(e);
	}
	
	
	void getEmployee()
	{
		
	}
	
	

	public Employee() {
		super();
		System.out.println("base class "+Employee.class.getName());
	}


	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	private void getEmployeeData()
	{
		System.out.println("employee");
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public static String getEmpNationality() {
		return empNationality;
	}




	public static void setEmpNationality(String empNationality) {
		Employee.empNationality = empNationality;
	}




	public Department getEmpDept() {
		return empDept;
	}




	public Employee(int empId, String empName, Department empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
	}


	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}

	
	public static void  testStatic()
	{
		System.out.println("testStatic Employee");
	}



	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Employee e= new Employee();
		Employee.empNationality="Indian";
		System.out.println(empNationality);
		e.empId=1;
		e.empName="krishan";
		Department d = new Department(1, "Divinity");
		e.setEmpDept(d);
		System.out.println(e.empId+"  "+e.empName);
		e.getPersonData();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
		oos.writeObject(e);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
		Employee e1=(Employee)ois.readObject();
		ois.close();
		System.out.println("deserialized employee object is   "+e1);
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", nationality =" + empNationality +"]";
	}

}
