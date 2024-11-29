package com.kn.controlconstructs;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number from 1 to 7 :");
		int num = scan.nextInt();
		String result = dayOfTheWeek(num);
		System.out.println(result);
		scan.close();
		

	}

	public static String dayOfTheWeek(int num) {
		switch (num) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thrusday";
			
		case 5:
			return "Friday";
			
		case 6:
			return "Saturday";
			
		case 7:
			return "Sunday";

		}
		return "Please enter a valid number to check the day";
	}

}
