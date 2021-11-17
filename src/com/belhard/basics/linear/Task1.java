package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = ConsoleReader.getDoubleFromConsole(scanner, "Enter number a, please: ");
		double b = ConsoleReader.getDoubleFromConsole(scanner, "Enter number b, please: ");
		double c = ConsoleReader.getDoubleFromConsole(scanner, "Enter number c, please: ");
		double z = ((a - 3)*b/2) + c;
		ResultPrinter.printToConsole("Result of the function ((a - 3)*b/2) + c is: ", z);
	
	}

}
