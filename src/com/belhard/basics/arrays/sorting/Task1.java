package com.belhard.basics.arrays.sorting;

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
		int[] randomIntArray =  ArrayCreator.createRandomIntArray(arrayLength, minRange, maxRange);
		ArrayCreator.printArray(arrayLength, randomIntArray);
		bubbleSort(randomIntArray);
	}
	
	public static void bubbleSort(int[] array) {
		int comparisonsDone = 0;
		int swapsDone = 0;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				ArrayCreator.printArray(array.length, array);
				if (array[i] > array[i + 1]) {
					ResultPrinter.printToConsole("Swap " + array[i] + " and " + array[i + 1]);
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapsDone++;
					sorted = false;					
				} else {
					ResultPrinter.printToConsole(" No need to change elements " + i + " and " + (i + 1));
				}
				comparisonsDone++;
			}			
		}
		ResultPrinter.printToConsole("Array size = " + array.length);
		ResultPrinter.printToConsole("Comparisons done = " + comparisonsDone);
		ResultPrinter.printToConsole("Swaps done = " + swapsDone);
	}

}
