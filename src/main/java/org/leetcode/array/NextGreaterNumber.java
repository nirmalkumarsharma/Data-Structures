package org.leetcode.array;

import java.util.Arrays;

public class NextGreaterNumber {

	public static void main(String[] args) {
		//int[] nums = new int[] {6,9,3,8,6,5,2};
		int[] nums = new int[] {5,4,3};
		findNextGreaterArrangement(nums);
		for (int i : nums) {
			System.out.print(i+",");
		}
	}
	private static void findNextGreaterArrangement(int[] nums) {
		if(nums.length == 1) {
			return;
		}
		for(int i = nums.length-2; i >= 0; i--) {
			if(nums[i] < nums[i+1]) {
				for(int j = nums.length-1; j > i; j--) {
					if(nums[i]<nums[j]) {
						swap(nums, i, j);
						Arrays.sort(nums, i+1, nums.length);
						return;
					}
				}
			}
		}
		int start = 0;
		int end = nums.length-1;
		while(start < end) {
			swap(nums, start, end);
			start++; end--;
		}
	}
	private static void swap(int[] nums, int first, int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
}
