package com.kn.controlconstructs;

import java.util.Scanner;

public class FirstNNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int result = naturalNumbers(n);
		System.out.println("The sum of the first "+ n +" natural numbers are "+result);
		scan.close();

	}

	public static int naturalNumbers(int n) {
		int sum = 0;
		int i=1;
		while(i<=n) {
			sum += i;
			i++;
		}
		return sum;
	}

}
