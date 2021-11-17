package com.belhard.basics.util;

import java.util.Scanner;

public class ConsoleReader {
	public static int getIntegerFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int intNumber = 0;
		if (scanner.hasNextInt()) {
			intNumber = scanner.nextInt();
			System.out.println("Your number is: " + intNumber);
		} else {
			System.out.println("Wrong number type. It need to be Integer. Try again.");
			System.exit(1);
		}
		return intNumber;
	}
	public static double getDoubleFromConsole(Scanner scanner, String prompt) {
		System.out.print(prompt);
		double doubleNumber = 0.0;
		if (scanner.hasNextDouble()) {
			doubleNumber = scanner.nextDouble();
			System.out.println("Your number is: " + doubleNumber);
		} else {
			System.out.println("Wrong number type. It need to be Double. Try again.");
			System.exit(1);
		}
		return doubleNumber;
	}

}
