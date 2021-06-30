package org.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class RunLengthDecode {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] decompressRLElist = decompressRLElist(nums);
		for (int i : decompressRLElist) {
			System.out.print(i+"\s");
		}
	}

	private static int[] decompressRLElist(int[] nums) {
		List<Integer> resultList = new ArrayList<>();
		for (int i = 0; i < nums.length - 1; i += 2) {
			for (int j = 0; j < nums[i]; j++) {
				resultList.add(nums[i + 1]);
			}
		}
		int[] resultArr = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			resultArr[i] = resultList.get(i);
		}
		return resultArr;
	}
}
