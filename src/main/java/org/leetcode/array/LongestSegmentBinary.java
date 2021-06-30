package org.leetcode.array;

public class LongestSegmentBinary {

	public static void main(String[] args) {
		String s = "0111111";
		System.out.println(checkZeroOnes(s));

	}

	public static boolean checkZeroOnes(String s) {
		char lastChar = s.charAt(0);
		int lastIndex = 0;
		int maxZeroLength = 0;
		int maxOneLength = 0;
		for (int i = 0; i < s.length(); i++) {
			if (lastChar != s.charAt(i)) {
				int length = i - lastIndex;
				if (lastChar == '0') {
					if (maxZeroLength < length) {
						maxZeroLength = length;
					}
				} else {
					if (maxOneLength < length) {
						maxOneLength = length;
					}
				}
				lastIndex = i;
			} else {
				
			}
			lastChar = s.charAt(i);
		}
		
		int length = s.length() - lastIndex;
		if (lastChar == '0') {
			if (maxZeroLength < length) {
				maxZeroLength = length;
			}
		} else {
			if (maxOneLength < length) {
				maxOneLength = length;
			}
		}
		if (maxOneLength > maxZeroLength) {
			return true;
		} else {
			return false;
		}
	}
}
