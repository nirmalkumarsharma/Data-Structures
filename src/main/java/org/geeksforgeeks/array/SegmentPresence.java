package org.geeksforgeeks.array;

import java.util.Scanner;

public class SegmentPresence {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] a =  new int[n];
		int k = inp.nextInt();
		int m = inp.nextInt();
		for ( int i = 0; i < n; i++ ) {
			a[i] = inp.nextInt();
		}
		boolean presence = findNext(a,k,m);
		System.out.println(presence);
		inp.close();
	}

	private static boolean findNext(int[] a, int k, int m) {
		int n = a.length;
		int i;
		for ( i = 0; i < n; i+=k ) {
			int j;
			for ( j = 0; j < k; j++ ) {
				if( a[i+j] == m ) {
					break;
				}
			}
			if( j == k) {
				return false;
			}
		}
		if( i == n ) {
			return true;
		}
		int j;
		for ( j = i-k; j < k; j++ ) {
			if( a[j] == m ) {
				break;
			}
		}
		if( j == n ) {
			return false;
		}
		return true;
	}
}
