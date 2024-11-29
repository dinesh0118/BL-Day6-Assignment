package com.kn.controlconstructs;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of the students : ");
		int marks = scan.nextInt();
		String result = gradeCal(marks);
		System.out.println();
		System.out.println("Grade :" + result);
		scan.close();

	}

	public static String gradeCal(int marks) {
		if(marks >= 90) {
			return "A";
		}
		else if(marks >= 80) {
			return "B";
		}
		else if(marks >= 70) {
			return "C";
		}
		return "Fail";
	}

}
