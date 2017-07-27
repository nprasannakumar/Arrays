package com.test.questions;

public class MissingNumberInArray {
	
	public static void main(String[] args){
		
		int no = findMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
		System.out.println(no);
		
	}
	
	public static int findMissingNumber(int[] input, int size){
		int expectedSum = size * (size+1)/2;
		int actualSum = 0;
		for(int i=0; i<input.length;i++){
			actualSum += input[i]; 
		}
		return expectedSum - actualSum;
	}

}
