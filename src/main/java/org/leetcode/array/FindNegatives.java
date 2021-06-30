package org.leetcode.array;

public class FindNegatives {

	public static void main(String[] args) {
		int[][] grid = new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		int countNegatives = countNegatives(grid);
		System.out.println(countNegatives);
	}

	private static int countNegatives(int[][] grid) {
		int negatives = 0;
		for (int[] arr : grid) {
			negatives+=findNegatives(arr);
		}
		return negatives;
	}
	
	private static int findNegatives(int[] arr) {
		int n = arr.length-1;
		if(arr[0] < 0) {
			return arr.length;
		}
		if(arr[n] >= 0) {
			return 0;
		}
		int start = 0;
		int end = n;
		while(start<end) {
			int mid = (start + end)/2;
			if(start == end) {
				break;
			}
			if(arr[mid] < 0) {
				end = mid;
			} else {
				start = mid+1;
			}
		}
		int count = arr.length-start;
		return count;
	}
}
