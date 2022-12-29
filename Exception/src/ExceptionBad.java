import java.util.Scanner;

public class ExceptionBad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the football club name:");
		
		String name = sc.next();
		
		sc.close();
		
		try {
			if(name.equals("NBA")) {
				Exception exception = new Exception("NBA is not Valid club.");
				throw exception;
			}
			
		}
		catch(Exception e) {
			
			System.out.println("error occur.");
			e.printStackTrace();
			
			return;
		}
		System.out.println(name);
		System.out.println("Yes this is valid club name.");
}
}