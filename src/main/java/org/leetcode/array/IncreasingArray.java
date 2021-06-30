package org.leetcode.array;

public class IncreasingArray {

	public static void main(String[] args) {
		int[] num = new int[]{1,5,2,4,1};
		int minOperations = minOperations(num);
		System.out.println(minOperations);
	}

	public static int minOperations(int[] nums) {
		int increments = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= nums[i - 1]) {
				int increment = nums[i - 1] - nums[i] + 1;
				nums[i] += increment;
				increments += increment;
			}
		}
		return increments;
	}
}
