package com.belhard.basics.arrays.multidimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayCreator;
import com.belhard.basics.util.ConsoleReader;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstArrayLength = ArrayCreator.arrayLength(scanner, "Enter your first array length, please: ");		
		int secondArrayLength = ArrayCreator.arrayLength(scanner, "Enter your second array length, please: ");		
		int minRange = ConsoleReader.getIntegerFromConsole(scanner, "Enter array minimum range value, please: ");
		int maxRange = ConsoleReader.getIntegerFromConsole(scanner, "Enter array maximum range value, please: ");
		int[][] randomIntArray = ArrayCreator.createRandomIntArray(firstArrayLength, secondArrayLength, minRange, maxRange);
		ArrayCreator.printArray(firstArrayLength, secondArrayLength, randomIntArray);		
		
	}

}
