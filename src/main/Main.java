package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heltal = 75;
		byte minByte = (byte) 192;



		//Olika primitiva datatyper.
		//double, int, short, long, boolean
		//float, -::-
		// char, byte,

		//System.out.print("Mata in heltal: ");
		Scanner scanner = new Scanner(System.in);

		//heltal = scanner.nextInt();
		//heltal = scanner.nextInt();

		//System.out.println("Du skrev: " + heltal);


		String mittNamn;

		System.out.print("Mata in ditt namn: ");
		mittNamn = scanner.nextLine();

		System.out.println("Du skrev: " + mittNamn);	}

}
