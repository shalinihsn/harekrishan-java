package array;
public class RepeatElement 
{ 
	void printRepeating(int arr[], int size) 
	{ 
		int count[] = new int[size]; 
		int i; 

		System.out.println("Repeated elements are : "); 
		for (i = 0; i < size; i++) 
		{ 
			if (count[arr[i]] == 1) 
				System.out.println(arr[i] + " "); 
			else
			{
				System.out.println("count[arr[i]] for index "+arr[i]+"is "+count[arr[i]]);
				count[arr[i]]++; 
				System.out.println("count[arr[i]] for index "+arr[i]+"is "+count[arr[i]]);
			}
		} 
	} 

	public static void main(String[] args) 
	{ 
		RepeatElement repeat = new RepeatElement(); 
		int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
		int arr_size = arr.length; 
		repeat.printRepeating(arr, arr_size); 
	} 
} 

