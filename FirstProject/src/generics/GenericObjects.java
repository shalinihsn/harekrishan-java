package generics;

public class GenericObjects<T extends Number> {
	T obj1;
	T obj2;
	
	public GenericObjects(T object1,T object2)
	{
		this.obj1=object1;
		this.obj2=object2;
	}
	
	public  void addObjects()
	{
		
		
		int sum=this.obj1.intValue()+this.obj2.intValue();
		System.out.println(sum);
	}
	
	public void subtract()
	{
		System.out.println(this.obj1.intValue()-this.obj2.intValue());
	}

	public static void main(String[] args) {
		GenericObjects<Integer> g1= new GenericObjects<Integer>(10,20);
		g1.addObjects();
		g1.subtract();
		

	}

}
