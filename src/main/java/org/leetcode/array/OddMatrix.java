package org.leetcode.array;

public class OddMatrix {

	public static void main(String[] args) {
		int m = 2;
		int n = 3;
		int[][] indices = new int[][] {{0, 1},{1, 1}};
		int odds = oddCells(m, n, indices);
		System.out.println(odds);
	}
	public static int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        int odds = 0;
        for(int[] index : indices){
            performIncrement(matrix, m, n, index[0], index[1]);
        }
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(matrix[i][j]%2 == 1) {
        			odds++;
        		}
        	}
        }
        return odds;
    }
    private static void performIncrement(int[][] matrix, int m, int n, int x, int y){
        for(int i = 0; i < m; i++){
            matrix[i][y]++;
        }
        for(int i = 0; i < n; i++){
            matrix[x][i]++;
        }
    }
}
