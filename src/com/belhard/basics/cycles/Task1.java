package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = ConsoleReader.getIntegerFromConsole(scanner, "Enter any positive integer number, please: ");
		
		double result = 0.0;
		if ( a > 0 ) {
			result = (1 + a)*a / 2.0;			
		} else {
			System.out.println("Type positive number and try again.");
			System.exit(1);
		}
		ResultPrinter.printToConsole("Answer is: ", result);
		
	}

}
