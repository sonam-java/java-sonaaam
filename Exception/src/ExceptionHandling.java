
public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 50;
		int b = 0;
		int c=0;
		
		try {
			
			c=a/b;
		}
		
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		System.out.println(c);
	}

}
