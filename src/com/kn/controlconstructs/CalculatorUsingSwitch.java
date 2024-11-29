package com.kn.controlconstructs;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Please enter the operator (+, -, *, /) to perform the operation ");
		char operator = scan.next().charAt(0);
		
		double result = calculator(num1,num2,operator);
		System.out.println(result);
		scan.close();
	}

	public static double calculator(int num1, int num2, char operator) {
		switch (operator) {
		case '+':
			return num1+num2;
		case '-':
			return num1-num2;
			
		case '*':
			return num1*num2;
			
		case '/':
			if (num2 != 0) {
                return (double) num1 / num2; // Cast to double for fractional division
            }
		}
		return 0;
	}	
}
