import java.util.TreeMap;

public class StringPlaindrome {
	
	
	
	public static String longestSubSequencePalindrome(String a)
	{
		char[] arr=a.toCharArray();
		int start=0;
		int end=arr.length-1;
		int mid=(end-start)/2;
		System.out.println("mid of char array is "+arr[mid]);
		String rev="";
		String original="";
		for(int i=0;i<mid;i++) 
		  { 
			  original=original+arr[i];
		  
		  }
		
		  for(int i=end;i>mid;i--) 
		  { 
			  rev=rev+arr[i];
		  
		  }
		  
		  if(original.equals(rev))
		  {
			  System.out.println("String is a palindrome");
			  return rev;
		  }
		  else
		  {
			  System.out.println("String is not a palindrome");
			  return "not a palindrome";
		  }
		 		
		  
		   
		
	}

	public static void main(String[] args) {

		String s="aabcdebaz";
		
		String result=longestSubSequencePalindrome(s);
		System.out.println("Largest subsequence of palindrome is "+result);
		TreeMap<String, String> map= new TreeMap<String, String>();
		
		int[]a,b;
		//System.out.println(b.getClass().getName());
		
		
	}

}
