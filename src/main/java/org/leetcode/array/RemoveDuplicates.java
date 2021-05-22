package org.leetcode.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// int nums[] = new int[] {1,2,2,2,2,3,4,4,4,4,4,2,2,2,2,2,3};
		int nums[] = new int[] {2, 3, 3, 3, 2 };
		int length = removeElement(nums, 2);
		for (int i = 0; i < length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

	private static int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1 && nums[0] != val) {
			return 1;
		}
		if (nums.length == 1 && nums[0] == val) {
			return 0;
		}

		int lastNonValPos = nums.length - 1;

		while (nums[lastNonValPos] == val) {
			lastNonValPos--;
			if (lastNonValPos < 0) {
				return 0;
			}
		}
		
		if(lastNonValPos == 0) {
			return 1;
		}

		int start = 0;
		while (start < lastNonValPos) {
			if (nums[start] == val) {
				swap(nums, start, lastNonValPos);
				while (nums[lastNonValPos] == val) {
					lastNonValPos--;
					if(lastNonValPos == start) {
						return start+1;
					}
				}
			}
			start++;
			if(lastNonValPos == start) {
				return start+1;
			}
		}
		return nums.length;
	}

	private static void swap(int[] nums, int first, int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
}
