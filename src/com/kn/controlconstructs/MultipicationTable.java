package com.kn.controlconstructs;

import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scan.nextInt();
		int sum = 0;
		int i = 1;
		if(num != 0) {
			while(i<=10) {
				sum = (num * i);
				System.out.println(num + "*" + i + "=" + sum);
				i++;
			}
		}
		else {
			System.out.println("Please enter the numbers above 0 ");
		}
		scan.close();
	}

}
