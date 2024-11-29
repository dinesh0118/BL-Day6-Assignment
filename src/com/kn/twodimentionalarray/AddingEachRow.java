package com.kn.twodimentionalarray;


import java.util.Scanner;

public class AddingEachRow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of each row "+(i+1)+" is "+sum);
		}	

	}

}
