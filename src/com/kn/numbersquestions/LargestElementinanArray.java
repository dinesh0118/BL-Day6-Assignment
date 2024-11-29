package com.kn.numbersquestions;

import java.util.Scanner;

public class LargestElementinanArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {100,5,20,10,40};
		int result = arr[0];
		for(int res : arr) {
			if(res > result) {
				result = res;
			}
		}
		System.out.println("Largest Number is "+result);
		scan.close();
		
	}

}
