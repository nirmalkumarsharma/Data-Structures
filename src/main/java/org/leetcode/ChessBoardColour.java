package org.leetcode;

public class ChessBoardColour {

	public static void main(String[] args) {
		String position = "a5";
		identifyColour(position);
	}

	private static boolean identifyColour(String position) {
		int x = position.charAt(0);
		int y = Integer.parseInt(position.substring(1));
		if((x%2==0 && y%2==0)||(x%2==1 && y%2==1)) {
			return false;
		} else {
			return true;
		}
	}
}
