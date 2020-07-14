
public class ContigiousLargestSumArray {

	
	public static int getLargestContigiousSubArraySum(int[] array)
	{
		int max_ending_here=0;
		int max_sofar=0;
		for(int i=0;i<array.length;i++)
		{
			max_ending_here=max_ending_here+array[i];
			if(max_ending_here < 0)
			{
				max_ending_here=0;
			}
			if(max_sofar < max_ending_here)
			{
				max_sofar=max_ending_here;
			}
				
		}
		return max_sofar;
	}
	public static void main(String[] args) {

		
		int[] arr= {10,20,5,2,3,1,-4,-9};
		
		int sum=getLargestContigiousSubArraySum(arr);
		System.out.println("maximum contigious sub array sequence is "+sum);
	}

}
