package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = ConsoleReader.getDoubleFromConsole(scanner, "Enter coordinate x, please: ");
		double y = ConsoleReader.getDoubleFromConsole(scanner, "Enter coordinate y, please: ");
		
		if ( x == 0 && y == -1 ) {
			System.out.println(false);
		} else if ( y <= 4 && x <= 2 && x >= -2) {
			System.out.println(true);
		} else if ( y >= -3 && x >= -4 && x <=4 ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
