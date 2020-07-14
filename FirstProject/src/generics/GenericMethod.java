package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
	
	public static <T> void printElements(List<Box<T>> listOfBoxes)
	{
		for(Box<T> t :listOfBoxes)
		{
			System.out.println(t.get());
		}
	}
	
	
	public static void main(String[] args)
	{
		Box<Integer> b1= new Box<Integer>(10);
		Box<Integer> b2= new Box<Integer>(20);
		Box<Integer> b3= new Box<Integer>(30);
		List<Box<Integer>> listOfBoxes = new ArrayList<Box<Integer>>();
		listOfBoxes.add(b1);
		listOfBoxes.add(b2);
		listOfBoxes.add(b3);
		Box<String> ba= new Box<String>("Krishan");
		Box<String> bb= new Box<String>("Gauri");
		Box<String> ab= new Box<String>("Shalini");
		Box<String> aa= new Box<String>("Amit");
		List<Box<String>> listOfStringBoxes = new ArrayList<Box<String>>();
		listOfStringBoxes.add(ba);
		listOfStringBoxes.add(bb);
		listOfStringBoxes.add(ab);
		listOfStringBoxes.add(aa);
		GenericMethod.printElements(listOfBoxes);
		GenericMethod.printElements(listOfStringBoxes);
	}

}
