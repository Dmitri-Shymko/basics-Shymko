package com.belhard.basics.cycles;

import java.math.BigInteger;

import com.belhard.basics.util.ResultPrinter;

public class Task5 {
	public static void main(String[] args) {
		BigInteger prod = BigInteger.valueOf(1);
		for (int i = 1; i < 200; i++) {
			BigInteger bigProd = BigInteger.valueOf(i);
			prod = prod.multiply(bigProd);			
			ResultPrinter.printToConsole(prod);
		}
		prod = prod.multiply(prod);
		ResultPrinter.printToConsole("Result is : WOW!  " + prod);
	}

}
