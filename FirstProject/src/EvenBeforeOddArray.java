
public class EvenBeforeOddArray {
	
	public static int[] getEvenBeforeOddArray(int [] array)
	{
		int [] evenArray=new int[5];
		int[] oddArray = new int[5];
		int[] resultArray= new int[evenArray.length+oddArray.length];
		
		int even=0;
		int odd=0;
		for(int i=0;i<array.length;i++)
		{
			
			
			if(array[i]%2==0)
			{
					evenArray[even]=array[i];
					even++;
			}
			else
			{
				oddArray[odd]=array[i];
				odd++;
			}
		}
	    System.arraycopy(evenArray, 0, resultArray, 0, evenArray.length);
	    System.arraycopy(oddArray, 0, resultArray, evenArray.length, oddArray.length);
		return resultArray;
	}

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		int [] result=getEvenBeforeOddArray(arr);
		for(int i:result)
		{
			System.out.print(i+" ");
		}
	}

}
