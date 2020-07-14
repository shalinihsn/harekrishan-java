package generics;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
	public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
		    Box<U> box = new Box<>(u);
		    //box.set(u);
		    boxes.add(box);
		  }

		  public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
		    int counter = 0;
		    for (Box<U> box: boxes) {
		      U boxContents = box.get();
		      System.out.println("Box #" + counter + " contains [" +
		             boxContents.toString() + "]");
		      counter++;
		    }
		  }

		  public static void main(String[] args) {
		    List<Box<Integer>> listOfIntegerBoxes =
		      new ArrayList<>();
		    List<Box<String>> listOfStrings = new ArrayList<>();
		    
		    System.out.println(listOfIntegerBoxes.size());
		    
		    BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
		    System.out.println(listOfIntegerBoxes.size());
		    BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		    BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		    BoxDemo.addBox(String.valueOf("Krishan"), listOfStrings);
		    BoxDemo.addBox(String.valueOf("Gauri"), listOfStrings);
		    BoxDemo.addBox(String.valueOf("shalini"), listOfStrings);
		    BoxDemo.addBox(String.valueOf("amit"), listOfStrings);
		    BoxDemo.outputBoxes(listOfStrings);
		  }

}
