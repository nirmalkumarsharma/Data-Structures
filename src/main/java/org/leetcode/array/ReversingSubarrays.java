package org.leetcode.array;

import java.util.Arrays;

public class ReversingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static boolean canBeEqual(int[] target, int[] arr) {
		Arrays.sort(target);
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			if(target[i] != arr[i]) {
				return false;
			}
		}
		return true;
    }
}
