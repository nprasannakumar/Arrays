package com.test.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static void main(String[] args){
		TwoSumProblem twoSum = new TwoSumProblem();
		int[] result = twoSum.twoSumProblem(new int[]{10,20,30,40}, 30);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
	
	// do a modification to print all pairs of numbers which add upto a sum
	// if you want all pairs, add to list and return and compare the 2 lists
	public int[] twoSumProblem(int[] input, int sum){
		
		if(input == null || input.length < 2 ){
			return new int[]{0,0};
		}
		Map<Integer, Integer> mapOfNumberToIndex = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i=0; i<input.length;i++){
			if(mapOfNumberToIndex.containsKey(input[i])){
				int x = mapOfNumberToIndex.get(input[i]);
				int y = i;
				result[0] = input[x];
				result[1] = input[y];
				return result;
			}else{
				mapOfNumberToIndex.put(sum - input[i], i);
			}
		}
		return result;
	}
	
	

}
