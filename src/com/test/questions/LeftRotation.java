package com.test.questions;

import java.util.Scanner;

public class LeftRotation {

//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//       // Scanner in = new Scanner(System.in);
//       // int n = in.nextInt();
//        //int d = in.nextInt();
//        int arr[] = new int[]{1,2,3,4,5};
////        for(int arr_i=0; arr_i < n; arr_i++){
////            arr[arr_i] = in.nextInt();
////        }
//        int move = 0;
//        int d = 4;
//        while(move != d){
//            int[] temp = new int[arr.length];
//            for(int i=0; i<arr.length; i++){
//                temp[i] = arr[i];
//            }
//            
//            int j=arr.length-1;
//            arr[arr.length-1] = temp[0];
//            for(int k=temp.length-1; k >0; k--){
//                       arr[j-1] = temp[k];
//                       j--;
//            }
//         move = move + 1;   
//        }
//        
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
   //     }
  //  }
    
    public static void main(String[] args){
    	int arr[] = new int[]{1,2,3,4,5};
    	int d = 4;
    	
    	int factor = arr.length - d;
    	System.out.println(factor);
    	int[] temp = new int[arr.length];
    	for(int i=0; i<arr.length; i++){
           temp[i] = arr[i];
    	 }
    	 
    	 for(int j=0; j<temp.length; j++){
    		 int k = j + factor;
    		 if(k >= temp.length){
    			k = k %arr.length;
    		 }
    		 arr[k] = temp[j];
    	 }
    	 
    	 for(int i=0; i<arr.length;i++){
    		 System.out.print(arr[i] + " ");
    	 }
    }
}
