package com.test.questions;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoSumProblemTest {
	
	// 10,20,30,40 sum=30 -- 10,20
	// -1,-2,3,-4 sum=2  -- 3, -1
	// 0,0,0,0 sum=0  --0,0
	// -1,-2,-3,-4 sum=-5 -- -2,-3
	// very long integers? -- how to test?--look into it
	// if we pass characters -- picks ascii, it should validate the input and fail
	// wrong sum? -- result 0
	// empty
	// empty character?
	@Test(dataProvider = "twoSumDataProvider")
	public void testTwoSum(int[] input, int sum, int[] expected){
		TwoSumProblem twoSum = new TwoSumProblem();
		int[] result = twoSum.twoSumProblem(input, sum);
		Assert.assertTrue(Arrays.equals(result, expected));
	}
	
	//{new int[]{'a','b'}, 'a', new int[]{'a','b'}}
	// picks ascii value
	// another test for incorrect sum --- the 2 outputs shuld not be equal
	// array length another example
	@DataProvider(name = "twoSumDataProvider")
	public static Object[][] createData(){
		return new Object[][]{
			{new int[]{10,20,20,40}, 30, new int[]{10,20}},
			//{new int[]{-1,-2,3,-4}, 2, new int[]{-1,3}},
			//{new int[]{0,0,0,0}, 0, new int[]{0,0}},
			//{new int[]{-1,-2,-3,-4}, -5, new int[]{-2,-3}},
			//{new int[]{'a','b'}, 'a', new int[]{'a','b'}},
			//{new int[2], 'a', new int[2]},
			//{new int[]{10,20}, 'a', new int[2]},
			//{new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, 2 * Integer.MAX_VALUE, new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}}
		};
	}
	
	

}
