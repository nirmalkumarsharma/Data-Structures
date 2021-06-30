package org.leetcode.array;

public class OddSumArray {

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3,6};
		System.out.println(sumOddLengthSubarrays(arr));
	}
	 public static int sumOddLengthSubarrays(int[] arr) {
	        int totalSum = 0;
	        for(int i = 1; i <= arr.length; i+=2) {
	        	for(int j = 0; j<arr.length-i+1;j++) {
	        		for(int k = j; k < i+j; k++) {
	        			System.out.print(arr[k]+" ");
	        			totalSum+=arr[k];
	        		}
	        		System.out.println();
	        	}
	        }
	        return totalSum;
	    }
}
