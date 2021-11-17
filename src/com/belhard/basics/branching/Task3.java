package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double firstAngleValue = ConsoleReader.getDoubleFromConsole(scanner, "Enter first angle value in degree, please: ");
		double secondAngleValue = ConsoleReader.getDoubleFromConsole(scanner, "Enter second angle value in degree, please: ");
		double thirdAngleValue;
		if (firstAngleValue > 0 && secondAngleValue > 0) {
			thirdAngleValue = 180.0 - firstAngleValue - secondAngleValue;
			if (thirdAngleValue > 0 && (thirdAngleValue == 90.0 || firstAngleValue == 90.0 || secondAngleValue == 90.0)) {
				System.out.println(" \nIt's right triangle.");
			} else if (thirdAngleValue > 0) {
				System.out.println(" \nIt'is triangle. But not the right.");
			} else {
				System.out.println("There cannot be triangle with such angles! Try again.");
			}
		} else {
			System.out.println("Wrong angle(s) value, it need to be > 0. Try again.");
			System.exit(0);
		}
	}

}
