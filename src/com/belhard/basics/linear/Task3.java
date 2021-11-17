package com.belhard.basics.linear;

import java.util.Scanner;
import com.belhard.basics.util.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = ConsoleReader.getIntegerFromConsole(scanner, "Enter time in seconds, please!");
		int seconds = time % 60;
		int minutes = time / 60;
		int hours = 0;
		if (minutes > 59) {
			hours = minutes / 60;
			minutes = minutes % 60;
		} else {
			hours = 0;
		}
		String sec;
		String min;
		String hour;
		if (seconds < 10) {
			sec = "0" + seconds;
		} else {
			sec = "" + seconds;
		}
		if (minutes < 10) {
			min = "0" + minutes;
		} else {
			min = "" + minutes;
		}
		if (hours < 10) {
			hour = "0" + hours;
		} else {
			hour = "" + hours;
		}
		ResultPrinter.printToConsole(hour + "h " + min + "min " + sec + "s");

	}

}
