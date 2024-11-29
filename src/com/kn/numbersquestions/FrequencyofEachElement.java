package com.kn.numbersquestions;

import java.util.Arrays;

public class FrequencyofEachElement {

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		boolean[]  visited= new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(!visited[i]) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if(arr[i] == arr[j]) {
						//count++;
						visited[j] = true;
					}
					count++;
				}
				//System.out.println(arr[i] +" : "+ count+(count >1 ? "times":"time"));
	
				System.out.print(count);
			}
			
		}

	}

}
