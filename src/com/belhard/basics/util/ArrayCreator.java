package com.belhard.basics.util;

import java.util.Scanner;

public class ArrayCreator {
	
	public static int arrayLength(Scanner scanner, String prompt) {
		System.out.print(prompt);
		int intNumber = 0;
		if (scanner.hasNextInt()) {
			intNumber = Math.abs(scanner.nextInt());
			System.out.println("Your array length is: " + intNumber);
		} else {
			System.out.println("Wrong number type. It need to be Integer. Try again.");
			System.exit(1);
		}
		return intNumber;
	}

	public static int[] createRandomIntArray(int arrayLength, int minRange, int maxRange) {
		int[] randomIntArray = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			randomIntArray[i] = (int) (Math.random() * ((maxRange - minRange) + 1) + minRange);			
		}		
		return randomIntArray;		
	}
	
	public static int[][] createRandomIntArray(int firstArrayLength, int secondArrayLength, int minRange, int maxRange) {
		int[][] randomIntArray = new int[firstArrayLength][secondArrayLength];
		for (int i = 0; i < firstArrayLength; i++) {
			for (int j = 0; j < secondArrayLength; j++) {
			randomIntArray[i][j] = (int) (Math.random() * ((maxRange - minRange) + 1) + minRange);	
			}
		}		
		return randomIntArray;		
	}
	
	public static double[] createRandomDoubleArray(int arrayLength, double minRange, double maxRange) {
		double[] randomDoubleArray = new double[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			randomDoubleArray[i] = Math.random() * ((maxRange - minRange) + 1) + minRange;			
		}		
		return randomDoubleArray;		
	}
	
	public static void printArray(int arrayLength, int randomIntArray[]) {
		System.out.println("\nElements of your random array are: ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(" " + randomIntArray[i]);
		}
	}
	
	public static void printArray(int arrayLength, double randomIntArray[]) {
		System.out.println("\nElements of your random array are: ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(" " + randomIntArray[i]);
		}
	}
	public static void printArray(int firstArrayLength, int secondArrayLength, int randomIntArray[][]) {
		System.out.println("Elements of your random array are: ");
		for (int i = 0; i < firstArrayLength; i++) {
			for (int j = 0; j < secondArrayLength; j++) {
				System.out.print("\t" + randomIntArray[i][j]);					
			}
			System.out.print("\n");
		}
	}
	
	public static int[] bubbleSort(int[] array) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;					
				} 
			}			
		}
		return array;
		
	}

}
