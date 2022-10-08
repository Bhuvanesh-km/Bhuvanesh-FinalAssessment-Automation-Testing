package automationTesting;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10/0;
			
		}
		catch(ArithmeticException e){
			System.out.println("can't divide number by zero "+e);
		}
		finally {
			System.out.println("finally block executed always");
		}
	}

}
