package com.kn.controlconstructs;

import java.util.Scanner;

public class FactorialOfNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int result = factorialOfNumbers(n);
		System.out.println("Factorial of "+n+" is " + result);
		scan.close();
	}

	public static int factorialOfNumbers(int n) {
		int sum = 1;
		int i=1;
		while(i<=n) {
			sum *= i;
			i++;
		}
		return sum;
	}

}
