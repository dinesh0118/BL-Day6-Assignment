package com.kn.twodimentionalarray;

import java.util.Scanner;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int sum = 0;
		System.out.println("Enter the elements into the matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
			
			if( i != arr.length-1-i) {
				sum += arr[i][arr.length-1-i];
			}
		}
		
		System.out.println(sum);

	}

}
