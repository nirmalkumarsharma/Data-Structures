package org.leetcode;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 0;
		for(int i = 0; i<30; i++) {
			System.out.print(fib(i)+"\s");
		}
	}

	private static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int num0 = 0;
			int num1 = 1;
			for (int i = 2; i <= n; i++) {
				int num = num0 + num1;
				if (i == n) {
					return num;
				}
				num0 = num1;
				num1 = num;
			}
		}
		return 0;
	}
}
