import java.util.HashSet;
import java.util.Set;

public class SubStrings {

	public static void main(String[] args) {

		
		String s ="aabcdef";
		Set<String> set= new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			Character c= s.charAt(i);
			set.add(Character.toString(c));
		}
		String[] arr= new String[set.size()];
		arr=set.toArray(arr);
		System.out.println("setToString"+arr+"  "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("set to string elements "+arr[i]);
		}
		
		/*
		 * int i;
		 * 
		 * for(i= 0;i<s.length();i++) { for(int j=i+1;j<=s.length();j++) { String
		 * substr=null; substr=s.substring(i,j); System.out.println(substr); }
		 * System.out.println("jloop complete"); System.out.println("value of i "+i ); }
		 * System.out.println("final value of i "+i );
		 */	}

}
