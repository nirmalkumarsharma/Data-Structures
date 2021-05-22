package org.leetcode;

public class StoneGame {

	public static void main(String[] args) {
		int[] piles = new int[] {3,3,4,5,6};
		winner(piles);
	}

	private static void winner(int[] piles) {
		int front = 0;
		int rear = piles.length-1;
		findWinner(piles, front, rear);
	}

	private static void findWinner(int[] piles, int front, int rear) {
	}
}
