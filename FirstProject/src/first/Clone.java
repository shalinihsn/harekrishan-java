package first;

public class Clone implements Cloneable{
	
	
	public Clone(int id, String name, Person person) {
		super();
		this.id = id;
		this.name = name;
		this.person = person;
	}



	public Clone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	private int id;
	private String name;
	private Person person;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	


	@Override
	public String toString() {
		return "Clone [id=" + id + ", name=" + name + ", person=" + person.isGender() +"     "+person.getAge()+ "]";
	}



	public static void main(String[] args) {
		
		Person pe= new Person(1,"God");
		
		Clone c = new Clone(1,"krishan",pe);
		try {
			Clone c2= (Clone) c.clone();
			System.out.println(c2);
			c2.person.setAge(2);
			
			
			System.out.println("c1  "+c);
			System.out.println("c2  "+c2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Clone c3=(Clone)super.clone();
		c3. person = new Person();
		person.setGender(this.person.isGender());
		person.setAge(this.person.getAge());
		
		return c3;
	}

}
