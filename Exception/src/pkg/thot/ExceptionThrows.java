package pkg.thot;
//the div method wants to convince compiler that it cant handle exception and 
//wants to be done by caller means wants to bypass exception
public class ExceptionThrows {
   //we use throws to declare exception and to bypass to caller method
	
	void div(int a, int b) throws ArithmeticException
	
	{
		if(b==0) {
		//we use throw keyword to create exceptional obj and throw explictly mean intentionally
			throw new ArithmeticException();//
		}
		else
		{
			int c = a/b;
			System.out.println(c);
		}
		
		
	}
	public static void main(String[] args){

		ExceptionThrows t = new ExceptionThrows();
		
		try{
			
			t.div(20,0);
		}
		
		catch(Exception e)
		{
			//System.out.println("The value of b is zero.");
			e.printStackTrace();
		}
		
	}

}
