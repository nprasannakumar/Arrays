package com.test.questions;

public class FindTopTwoNumbers {

	public static void main(String[] args){
		FindTopTwoNumbers topTwo = new FindTopTwoNumbers();
		//int[] input = new int[]{20,34,21, 87,92,2147};
		int[] input = new int[]{100, 91, 120, 150, 0};
		topTwo.findTopTwoNumbers(input);
	}
	
	public void findTopTwoNumbers(int[] input){
		int top1=0;
		int top2=0;
		int i=0;
		int j=1;
		while(j > i && j <input.length){
			if(input[i] > input[j]){
				if(input[i] > top1){
					top2 = top1;
					top1 = input[i];
				}
				if(input[j] > top2){
					top2 = input[j];
				}
			}else{
				if(input[j] > top1){
					top2 = top1;
					top1 = input[j];
				}
				if(input[i] > top2){
					top2 = input[i];
				}
			}
		i++;
		j++;
		}
		System.out.println("top1 :" +top1);
		System.out.println("top2 : " +top2);
	}
}
