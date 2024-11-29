package com.kn.numbersquestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReversetheArray {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int[] arr = {1,2,3,4,5};
//		int start = 0;
//		int end = arr.length-1;
//		while(start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//		}
//		System.out.println(Arrays.toString(arr));
		
		  int[] arr={1,12,35,4,2,5,63,4,56};
		  int[] ne = new int[arr.length];
	        int n=arr.length;
	        for (int i=0;i<n/2;i++){
	            int num=arr[i];
	            arr[i]=arr[n-1-i];
	            arr[n-1-i]=num;
	        }
	        
	        System.out.println(Arrays.toString(arr));

	}

}
