package com.kn.numbersquestions;

import java.util.Scanner;

public class FindMissingNumberinConsecutiveArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 7, 8};
		int actualSum =0;
		int n = arr.length+1;
		int expectedSum = (n*(n+1)) /2;
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}
		int res = expectedSum - actualSum;
		System.out.println(res);

	}

}
