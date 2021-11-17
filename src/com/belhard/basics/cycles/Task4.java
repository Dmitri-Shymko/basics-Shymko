package com.belhard.basics.cycles;

import com.belhard.basics.util.ResultPrinter;

public class Task4 {

	public static void main(String[] args) {
		ResultPrinter.printToConsole("Number    Symbol");
		for (int i = 32; i < 127; i++) {
			char symbol = (char) i;
			ResultPrinter.printToConsole(i + "\t" + symbol);
		}
	}

}
