package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class MinArray {

	public static void main(String[] args) {

		
		

		System.out.println("Enter the value of k");
		Scanner sc = new Scanner(System.in);
		int k= sc.nextInt();
		
		TreeMap<Integer,int []> map=new TreeMap<Integer,int []>();
		
		
		for(int i=0,j=0;i<k;i++)
		{
			int [] array= {1,2,5,3};
			int sum=0;
			//System.out.println("array element "+array[i]);
				int div=(int)Math.ceil((array[j]/2));
				array[j]=div;
				//System.out.println("array value changed is "+array[i]);
				for(int a:array)
				{
					sum=sum+a;
				}
				//System.out.println("sum is  "+sum);
				map.put(sum, array);
				j++;
		}
		System.out.println("map size  "+map.size());
		for(Integer i:map.keySet())
		{
			System.out.println("key "+i+"  value  "+Arrays.toString(map.get(i)));
			/*
			 * arr=map.get(i); for(int q=0;q<arr.length;q++) { System.out.println(arr[q]); }
			 */
		}
		System.out.println("Minimum value of array is  "+map.firstEntry().getKey());
	}

}
