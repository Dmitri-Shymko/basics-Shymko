package com.belhard.basics.branching;

import java.util.Scanner;
import com.belhard.basics.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = ConsoleReader.getIntegerFromConsole(scanner, "Enter number a, please: ");
		int b = ConsoleReader.getIntegerFromConsole(scanner, "Enter number b, please: ");
		int c = ConsoleReader.getIntegerFromConsole(scanner, "Enter number c, please: ");
		int d = ConsoleReader.getIntegerFromConsole(scanner, "Enter number d, please: ");
		int minAB;
		int minCD;
		
		if (a < b) {
			minAB = a;
		} else {
			minAB = b;
		}
		if (c < d) {
			minCD = c;
		} else {
			minCD = d;
		}
		if (minAB < minCD) {
			ResultPrinter.printToConsole("Maximum from minimums is: " + minCD);
		} else {
			ResultPrinter.printToConsole("Maximum from minimums is: " + minAB);
		}
		
	}

}
