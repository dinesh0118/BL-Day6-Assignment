package com.kn.controlconstructs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an number :");
		int n = scan.nextInt();
		String result = evenOrOdd(n);
		System.out.println("The given number is " +result);
		scan.close();

	}

	public static String evenOrOdd(int n) {
		if(n%2 ==0) {
			return "Even";
		}
		return "Odd";
	}

}
