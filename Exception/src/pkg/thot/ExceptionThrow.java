package pkg.thot;

import java.util.Scanner;

public class ExceptionThrow {

	static String inputTaken() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");

		String name = sc.next();

		if (name.equals("adobe")) {
			Exception e = new Exception("adobe is not valid name.");
			throw e;//obj exception is thrown as exception.

		}
		return name;
	}

	public static void main(String[] args) {

		String name = null;

		try {
			name = inputTaken();

		} catch (Exception e) {

			//System.out.println("exception occur.");
			
			e.printStackTrace();
             
			
			return;
			
		} finally {
			System.out.println(name + " this will print.");
		}
		System.out.println(name);
		System.out.println("THank you.");

	}

}
