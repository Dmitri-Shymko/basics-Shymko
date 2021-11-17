package com.belhard.basics.cycles;

import com.belhard.basics.util.ResultPrinter;

public class Task3 {

	public static void main(String[] args) {
		int result = 0;
		for ( int i = 0; i < 100; i++ ) {			
			result += i * i;			
		}
		ResultPrinter.printToConsole("Result is: ", result);
	}

}
