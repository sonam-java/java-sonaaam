package pkg.thot;

public class EXceptionCheck {

	//Unchecked exception=compiler does not force to write try/catch block
	//checked exception=compiler  forces to write try/catch block
	
		public static void main(String[] args) {
			/*int a=100;
			int b=0;
			int c=a/b; //throws ArithmeticException(Unchecked exception)
			
			System.out.println(c);*/
			
			
			try {
				Class.forName("com.mysql.jdbd.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //ClassNotFoundException(checked exception)
			
			System.out.println("exception handled");	
			
			
		}
	}

