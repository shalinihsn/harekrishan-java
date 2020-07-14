package first;

import java.io.Serializable;
import java.util.List;

public class Department extends Employee implements Serializable{
	
	private int deptId;
	private String deptName;
	private List<Employee> empList;
	

	


	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		Employee e = new Employee();
		e.empNationality="indian";
		
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	private void getEmployeeData()
	{
		System.out.println("employee");
	}
	  

	public List<Employee> getEmpList() {
		return empList;
	}


	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", empList=" + empList + "]";
	}

	public static void main(String[] args)
	{
		Department e= new Department(1,"cse");
		e.getEmployeeData();
	}

}
