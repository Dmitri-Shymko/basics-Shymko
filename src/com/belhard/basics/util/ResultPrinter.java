package com.belhard.basics.util;

import java.math.BigInteger;

public class ResultPrinter {
	public static void printToConsole(String annotation, int result) {
		System.out.println(annotation + result);
	}
		public static void printToConsole(String annotation, double result) {
			System.out.println(annotation + result);	
	}
		public static void printToConsole(String annotation) {
			System.out.println(annotation);	
	}
		public static void printToConsole(BigInteger annotation) {
			System.out.println(annotation);	
	}
}
