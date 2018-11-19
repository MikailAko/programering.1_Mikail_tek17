package input;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		
		String name = inputScanner.nextLine();

		System.out.println("Hello " + name);
		
		System.out.print("Enter your age: ");
		
		int age = inputScanner.nextInt();
		
		System.out.print("So your age is: " + age);
	}

}
