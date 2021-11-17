package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayCreator;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = ArrayCreator.arrayLength(scanner, "Enter your array length, please: ");		
		int minRange = ConsoleReader.getIntegerFromConsole(scanner, "Enter array minimum range value, please: ");
		int maxRange = ConsoleReader.getIntegerFromConsole(scanner, "Enter array maximum range value, please: ");
		int divider = ConsoleReader.getIntegerFromConsole(scanner, "Enter divider, please: ");
		int[] randomIntArray =  ArrayCreator.createRandomIntArray(arrayLength, minRange, maxRange);
		ArrayCreator.printArray(arrayLength, randomIntArray);
		int sum = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (randomIntArray[i] % divider != 0) {
				continue;
			}
			sum += randomIntArray[i];
		}
		ResultPrinter.printToConsole("\n The sum of elements of your random array, which can be divided on " + divider + " is: " + sum);
		
	}

}
