package com.belhard.basics.arrays.onedimentional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayCreator;
import com.belhard.basics.util.ConsoleReader;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayLength = 1;
		arrayLength = ArrayCreator.arrayLength(scanner, "Enter your array length, please: ");		
		int minRange = ConsoleReader.getIntegerFromConsole(scanner, "Enter minimum range value, please: ");
		int maxRange = ConsoleReader.getIntegerFromConsole(scanner, "Enter maximum range value, please: ");
		int[] randomIntArray =  ArrayCreator.createRandomIntArray(arrayLength, minRange, maxRange);
		ArrayCreator.printArray(arrayLength, randomIntArray);		
		ArrayCreator.bubbleSort(randomIntArray);
		
		int quantityOfMin = 1;
		for ( int i = 0; i < arrayLength; i++ ) {
			if ( i == arrayLength - 1) {
				break;
			}
			if ( randomIntArray[i] == randomIntArray[i+1] ) {
				quantityOfMin++ ;				
			} 			
		}
		int secondArrayLength = arrayLength - quantityOfMin;
		int[] secondIntArray =  new int[secondArrayLength];
		for (int i = 0; i < secondArrayLength; i++ ) {
			secondIntArray[i] = randomIntArray[i + quantityOfMin];
		}
		ArrayCreator.printArray(secondArrayLength, secondIntArray);
	}

}
