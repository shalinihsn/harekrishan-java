package lambdaExpressions;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=9;
		Predicate<Integer> p=(i)->i<10;
		
		System.out.println(p.test(9));
		

	}

}
