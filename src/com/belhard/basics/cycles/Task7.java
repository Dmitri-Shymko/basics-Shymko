package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = ConsoleReader.getIntegerFromConsole(scanner, "Enter number m, please: ");
		int n = ConsoleReader.getIntegerFromConsole(scanner, "Enter number n, please: ");
		int difference = m - n;		
		for (int i = 2; i < difference; i++ ) {
			int result = difference % i;
			if (result == 0) {
				ResultPrinter.printToConsole("Devisor of number " + difference + " is: " + i);
			} 
		}
		
	}

}
