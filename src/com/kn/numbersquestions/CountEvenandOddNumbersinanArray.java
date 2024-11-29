package com.kn.numbersquestions;

import java.util.Scanner;

public class CountEvenandOddNumbersinanArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {2,3,4,5,6};
		int evenCount = 0;
		int oddCount = 0;
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			 //res = (arr[i] % 2==0) ? evenCount++ : oddCount++;
			 evenCount += (arr[i] % 2==0) ? 1:0;
			 oddCount += (arr[i] % 2!=0) ? 1:0;
			
		}
		System.out.println("Even : "+ evenCount + ","+"Odd : "+oddCount);
//		for(int res : arr) {
//			if(res % 2 ==0) {
//				evenCount ++;	
//			}
//			else {
//				oddCount++;
//			}
//		}
//		System.out.println("Even : "+ evenCount + ","+"Odd : "+oddCount);
		
		scan.close();
	}

}
