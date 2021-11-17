package com.belhard.basics.branching;

import java.util.Scanner;
import com.belhard.basics.util.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = ConsoleReader.getIntegerFromConsole(scanner, "Enter number x, please: ");
		double result;
		if (x <= 3) {
			result = x * x - 3 * x + 9;
		} else {
			result = 1 / ((x * x * x) + 6);
		}
		ResultPrinter.printToConsole("Answer is: ", result);
	}

}
