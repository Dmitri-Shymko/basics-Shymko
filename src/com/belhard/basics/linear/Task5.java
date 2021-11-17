package com.belhard.basics.linear;

import java.util.Scanner;
import com.belhard.basics.util.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = ConsoleReader.getDoubleFromConsole(scanner, "Enter value x in Rad, please: ");
		double y = ConsoleReader.getDoubleFromConsole(scanner, "Enter value y in Rad, please: ");
		double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		ResultPrinter.printToConsole("Result of the function is: ", result);

	}

}
