package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayCreator;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double minRange = ConsoleReader.getDoubleFromConsole(scanner, "Enter array minimum range value of your array: ");
		double maxRange = ConsoleReader.getDoubleFromConsole(scanner, "Enter array maximum range value of your array: ");
		int arrayLength = ArrayCreator.arrayLength(scanner, "Enter your array length, please: ");
		double[] randomDoubleArray = ArrayCreator.createRandomDoubleArray(arrayLength, minRange, maxRange);
		ArrayCreator.printArray(arrayLength, randomDoubleArray);
		
		int quantityOfZeros = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (randomDoubleArray[i] == 0) {
				quantityOfZeros++;
				continue;
			}
		}
		ResultPrinter.printToConsole("\nQuantity of zeros is: " + quantityOfZeros);
		int quantityOfPositive = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (randomDoubleArray[i] > 0) {
				quantityOfPositive++;
				continue;
			}
		}
		ResultPrinter.printToConsole("Quantity of positive numbers is: " + quantityOfPositive);
		int quantityOfNegative = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (randomDoubleArray[i] < 0) {
				quantityOfNegative++;
				continue;
			}
		}
		ResultPrinter.printToConsole("Quantity of negative numbers is: " + quantityOfNegative);
		
	}

}
