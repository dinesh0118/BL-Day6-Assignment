package com.kn.controlconstructs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		int result = reverseANumber(num);
		System.out.println("The reverse of the number is "+result);
		scan.close();
	}

	public static int reverseANumber(int num) {
		
		int n1,sum=0;
		while(num != 0) {
			n1 = num%10;
			sum = sum *10+n1;
			num = num/10;
			
		}
		return sum;
	}

}
