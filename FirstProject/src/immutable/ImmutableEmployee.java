package immutable;

import java.util.HashMap;
import java.util.Map;

final public class ImmutableEmployee {
	
	
	/*deep copy 
	public ImmutableEmployee(int id, String name, HashMap<String, String> dob) {
		super();
		this.id = id;
		this.name = name;
		HashMap<String,String> hashmap= new HashMap<String, String>();
		for(String k : dob.keySet())
		{
			System.out.println("key "+k+"  value "+dob.get(k));
			hashmap.put(k,dob.get(k));
		}
		this.map = hashmap;
	}
	*/
	
	public ImmutableEmployee(int id, String name, HashMap<String, String> dob) {
		super();
		this.id = id;
		this.name = name;
		this.map = dob;
	}



	private final int id;
	private final  String name;
	private final HashMap<String,String> map;
	
	

	public static void main(String[] args) {
		HashMap<String,String> hm= new HashMap<String, String>();
		hm.put("HareKrishan", "Harekrishan");
		ImmutableEmployee emp= new ImmutableEmployee(1,"HareKrishanJi",hm);
		hm.put("Kanha", "Kanha");
		
		//System.out.println("hashmap value"+hm.toString());
		Map<String,String> clonedmap=emp.getMap();
		System.out.println("original map and cloned map same references "+(hm==clonedmap)+" equal "+(hm.equals(clonedmap)));
		
		  System.out.println("original  "+emp);
		  System.out.println("hash map "+(hm));
		 		
		/*
		 * // create two hash maps HashMap newmap1 = new HashMap(); HashMap newmap2 =
		 * new HashMap();
		 * 
		 * // populate 1st map newmap1.put(1, "tutorials"); newmap1.put(2, "point");
		 * newmap1.put(3, "is best");
		 * 
		 * // clone 1st map newmap2 = (HashMap)newmap1.clone(); newmap2.put(4,
		 * "Harekrishan");
		 * 
		 * System.out.println("1st Map: " + (newmap1==newmap2));
		 * System.out.println("Cloned 2nd Map: " + newmap2);
		 * System.out.println("original map : "+newmap1);
		 * System.out.println("class map value"+emp.getMap().toString());
		 */
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public HashMap<String, String> getMap() {
		//return  (HashMap<String, String>) map.clone(); for deep copy we use clone method because it creates a new hashmap object and returns it.
		return map;
	}



	@Override
	public String toString() {
		return "ImmutableEmployee [id=" + id + ", name=" + name + ", map=" + map + "]";
	}



	
}
