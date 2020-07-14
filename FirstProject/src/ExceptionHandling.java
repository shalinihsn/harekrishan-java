public class ExceptionHandling {
	 static int dividebyzero(int i) {

		 
		 try
		 {
			
			 if(i==10)
			 {
			int result=i/0;
			return result;
			 }
			 throw new MyException("myexception thrown");
			//return i;
		 }  
		 catch(ArithmeticException e)
		 {
			 //System.out.println("catch block");
			 //throw new MyException("Exception caught in catch block");
			 System.out.println(e.getMessage());
		 }
		 catch(MyException e)
		 {
			 //System.out.println("catch block");
			 //throw new MyException("Exception caught in catch block");
			 System.out.println(e.getMessage());
		 }
		 
		 finally
		 {
			 return 3;
		 }
	}

	public static void main(String[] args) {
		
		
	int result=	dividebyzero(5);

	System.out.println("result is "+result);
	}

	

}
