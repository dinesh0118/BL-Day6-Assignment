package com.kn.numbersquestions;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheSecondLargestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 12, 35, 1, 10, 34, 1 };
//		Arrays.sort(arr);
//		int a = arr.length-1;
//		int res = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			res = (arr[a-1]);
//		}
//		
//		System.out.println(res);
		
		
		//[1, 1, 10, 12, 34, 35]
		int maxValue = arr[0];
		
		System.out.println(Arrays.toString(arr));
		for (int res : arr) {
			if (maxValue < res) {   
				maxValue = res -1;
			}
		}

		System.out.println(maxValue);
	}

}
