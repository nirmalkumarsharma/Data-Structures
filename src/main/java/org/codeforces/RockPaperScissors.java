package org.codeforces;

import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] a = new int[3];
		int[] b = new int[3];
		
		for (int i = 0; i < 3; i++) {
			a[i] = inp.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			b[i] = inp.nextInt();
		}
		
		findMaxAndMin(a,b,n);
		
		inp.close();
	}

	private static void findMaxAndMin(int[] a, int[] b, int n) {
		
		int max = 0, min = 0;
		
		int[] aliceMaxA = new int[3];
		int[] aliceMaxB = new int[3];
		
		for (int i = 0; i < 3; i++) {
			aliceMaxA[i] = a[i];
		}
		
		for (int i = 0; i < 3; i++) {
			aliceMaxB[i] = b[i];
		}
		
		int[] aliceMinA = new int[3];
		int[] aliceMinB = new int[3];
		
		for (int i = 0; i < 3; i++) {
			aliceMinA[i] = a[i];
		}
		
		for (int i = 0; i < 3; i++) {
			aliceMinB[i] = b[i];
		}
		
		max += Math.min(aliceMaxA[0], aliceMaxB[1]);
		max += Math.min(aliceMaxA[1], aliceMaxB[2]);
		max += Math.min(aliceMaxA[2], aliceMaxB[0]);
		
		min += Math.max(0, aliceMinA[0]-(aliceMinB[0]+aliceMinB[2]));
		min += Math.max(0, aliceMinA[1]-(aliceMinB[1]+aliceMinB[0]));
		min += Math.max(0, aliceMinA[2]-(aliceMinB[2]+aliceMinB[1]));
		
		
		System.out.println(min+" "+max);
	}

}
