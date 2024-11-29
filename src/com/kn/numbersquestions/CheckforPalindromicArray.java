package com.kn.numbersquestions;

public class CheckforPalindromicArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,1};
		boolean res = false;
		int start = 0;
		int end = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			if(arr[start] == arr[end]) {
				res = true;
				start++;
				end--;
			}
		}
		
		System.out.println("Palindrome : "+res);
	}

}
