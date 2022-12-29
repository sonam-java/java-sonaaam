
public class TryCatchDemo {

	public static void main(String[] args) {

		int num1 = 50;
		
		int num2 = 10;
		
		try {
			
			int result = num1/num2;
			System.out.println("Result "+ result);
			
			//if(result==50)
				return;
		}
		
		catch(NullPointerException e) {
			System.out.println("caught");
			
		}
		catch(Exception e) {
			
			System.out.println("General");
		}
		
		finally {
			System.out.println("this ends finally.");
		}
		
		
	}

}
