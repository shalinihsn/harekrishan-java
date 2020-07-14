package first;

public class Person {
	public Person() {
		super();
	}

	public Person(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}

	private int age;
	private String gender;
	
	protected void getPerson()
	{
		System.out.println("person");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
  static void getPersonData()
  {
	  System.out.println("Person data from Person class");
  }
  
  private void getData()
  {
	  System.out.println("Person datA");
  }
}
