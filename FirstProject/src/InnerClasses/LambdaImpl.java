package InnerClasses;

public class LambdaImpl {
	
	public static void sumMethod(int a,int b)
	{
		System.out.println("sum through method reference is "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= (a,b)->System.out.println("sum is  "+(a+b));
		c.sum(1, 2);
		Calculator c1 =LambdaImpl::sumMethod;
		c1.sum(1, 2);

	}

}
