package com.belhard.basics.linear;

import java.util.Scanner;
import com.belhard.basics.util.*;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = ConsoleReader.getDoubleFromConsole(scanner, "Enter number a, please: ");
		double b = ConsoleReader.getDoubleFromConsole(scanner, "Enter number b, please: ");
		double c = ConsoleReader.getDoubleFromConsole(scanner, "Enter number c, please: ");
		
		double result = (b + Math.sqrt(4 * a * c + b * b)) / (2 * a) - a * a * a * c + Math.sqrt(b);
		ResultPrinter.printToConsole("Result of the function is: ", result);

	}

}
