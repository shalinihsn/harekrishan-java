
public class UniqueSubstrings {
	
	public static final int MAX_CHARS=256;
	public static int uniqueElementsInString(String s)
	{
		
		System.out.println("string is  "+s);
		int[] count = new int[MAX_CHARS];
		//System.out.println("count length "+count.length);
		
		for(int i=0;i<s.length();i++)
		{
			//System.out.println("aa "+(int)s.charAt(i)+" charAt   "+s.charAt(i));

			count[s.charAt(i)]++;
		}
		
		
		int unique=0;
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0)
			{
			//System.out.print("count value "+count[i]);
			unique++;
			}
			//System.out.println();
		}
		return unique;
	}

	
	public  static int findAllSubStrings(String s, int len)
	{
		//int totalLen=len;
		int uniqueElementsLength=uniqueElementsInString(s);
		System.out.println("uniqueElementsLength "+uniqueElementsLength);
	  int minLen=uniqueElementsLength;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<=s.length();j++)
			{
				String subString=null;
				if(i<j)
				 subString = s.substring(i, j);
				else
					subString=s.substring(j, i);
				int subStrLen=subString.length();
				int uniqueElementsInSubStringLength=uniqueElementsInString(subString);
				
				if(subStrLen<minLen && uniqueElementsLength==uniqueElementsInSubStringLength)
				
				{
				   minLen=subStrLen;	
				}
					
				
			}
		}
		return minLen;
	}
	public static void main(String[] args) {

		
		String s="aabcde";
		int len = findAllSubStrings(s,s.length());
		System.out.println("len  "+len);
		
	}

}
