package first;
import static java.lang.System.out;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Krishan {
	 
	

	int id=1;
	String name;

	public Krishan( String name) {
		super();
		
		this.name = name;
	}
	public Krishan()
	{
		
	}
	
	private void printName()
	{
		System.out.println(name);
	}

	
static void 	printName(Krishan krishan)
	{
		System.out.println(krishan.hashCode());
		System.out.println(krishan.name);
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		// TODO Auto-generated method stub
		Krishan krishan =new Krishan("Gauri");
		System.out.println(Krishan.class.getCanonicalName());
		System.out.println(Krishan.class.getName());
		Krishan hari=Krishan.class.newInstance();
		System.out.println("hari  "+hari.id);
	Constructor<Krishan> c=Krishan.class.getDeclaredConstructor();
	Krishan kanha=c.newInstance();
	System.out.println("kanha.."+kanha);
		System.out.println(krishan.hashCode());
		printName(krishan);
		out.println("Hare Krishan");
		System.out.println("Thursday"+Days.THURSDAY.getNumber());
		
	for(Days day:	Days.values())
	{
		System.out.println("day  "+day.name()+"  number  "+day.getNumber());
	}
    int i;
	for( i=0;i<5;i++)
		System.out.println(i);
	System.out.println(i);
	krishan.printName();
	
	
	}

}
