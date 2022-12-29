import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		
		String name = sc.next();
		
		try {
			
			if(name.equals("name123")) {
				
				Exception exception = new Exception("name123 is not permitted.");
				
				throw exception;
			}
		}
			
			catch(Exception e) {
				System.out.println(e.getMessage());
				
				return;
				
			}
			System.out.println(name);
			System.out.println("Thanks main end.");
			
		}
	}


