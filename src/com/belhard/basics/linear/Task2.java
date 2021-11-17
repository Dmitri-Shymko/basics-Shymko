package com.belhard.basics.linear;

import java.util.Scanner;
import com.belhard.basics.util.*;

public abstract class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double incomingNumber = ConsoleReader.getDoubleFromConsole(scanner, "Enter number in format: nnn.ddd  ");
		int numberBeforePoint = (int) incomingNumber;
		double numberAfterPoint = incomingNumber - numberBeforePoint;
		double outcomingNumber = numberAfterPoint * 1000 + (double)numberBeforePoint / 1000.0;
		ResultPrinter.printToConsole("Your number is: ", outcomingNumber);

	}

}
