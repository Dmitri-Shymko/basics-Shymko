package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double startPoint = ConsoleReader.getDoubleFromConsole(scanner, "Enter start point of the section, please: ");
		double finishPoint = ConsoleReader.getDoubleFromConsole(scanner, "Enter finish point of the section, please: ");
		if (startPoint > finishPoint) {
			ResultPrinter.printToConsole("a is need to be lower than b. Enter correct numbers please!");
			System.exit(1);
			} 
		
		double step = ConsoleReader.getDoubleFromConsole(scanner, "Enter step h, please: ");				
		double result = 0.0;
		while (  result < finishPoint - startPoint) {
			startPoint += step;
			result = startPoint;
			if (result > 2) {
				ResultPrinter.printToConsole("Result is: ", result);
			} else {
				ResultPrinter.printToConsole("Result is: ", -result);
			}
		}
		
	}

}
