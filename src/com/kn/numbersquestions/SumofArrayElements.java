package com.kn.numbersquestions;

import java.util.Scanner;

public class SumofArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		int ans = 0;
		for (int res : arr) {
			ans += res;
		}
		System.out.println(ans);
		scan.close();
	}

}
