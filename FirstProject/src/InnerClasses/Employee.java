package InnerClasses;

public class Employee {

	
	public Employee(int empId, String empName, String pancard) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.pancard = pancard;
	}

	void methodInnerclass()
	{
	    class Department{
	    	
	    	public Department(String deptName) {
				super();
				this.deptName = deptName;
			}

			private String deptName;
	    	
	    	void getEmployeeDept()
	    	{
	    		System.out.println("EmpName "+empName+" DeptName "+deptName);
	    	}
	    	
	    }
	    Department d= new Department("Credit Risk");
	    d.getEmployeeDept();
	}

	private int empId;
	private String empName;
	protected static String empNationality="Hindu";
	private String pancard;
	
	
	private class BankDetails{
		public BankDetails(int accountNo, int salary, String bankName) {
			super();
			this.accountNo = accountNo;
			this.salary = salary;
			this.bankName = bankName;
		}

		private int accountNo;
		private int salary;
		private String bankName;
		
		private void getEmployeeBankDetails()
		{
			System.out.println(empName+" "+pancard+" "+salary+" "+empNationality);
		}
		
	}
	
	static class OfficeBranch
	{
		public OfficeBranch(String branchCode, String branchName) {
			super();
			this.branchCode = branchCode;
			this.branchName = branchName;
			cityName="Mumbai";
		}
		private String branchCode;
		private String branchName;
		private static String cityName;
		
		void getEmployeeOfficeCity()
		{
			Employee e= new Employee(2,"Kanha","CQIPS0385N");
			System.out.println("EmpName "+e.empName+"  empNationality  "+empNationality+"  CityName  "+cityName+"   branchCode  "+branchCode);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1= new Employee(1,"krishan","CQIPS0385N");
		Employee.BankDetails bd=  e1.new BankDetails(1,5000000,"HDFC");
		Employee.OfficeBranch ob= new Employee.OfficeBranch("123", "Airoli");
		bd.getEmployeeBankDetails();
		e1.methodInnerclass();
		ob.getEmployeeOfficeCity();
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread name is"+Thread.currentThread().getName());
				System.out.println("aa"+('A'+'B'));
				//System.out.println("sum is "+);
				
			}
		});
		
		t.start();
		Calculator c= (int a,int b)->System.out.println("sum is  "+(a+b));
		Calculator c1= (int a,int b)->System.out.println("sum is  "+a+b);
		c.sum(1, 2);
	}

}
