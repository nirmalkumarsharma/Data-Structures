package org.geeksforgeeks.array;

import java.util.Scanner;

public class JustGreaterElement {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int [] a = new int[n];
		int element = inp.nextInt();
		for ( int i = 0; i < n; i++ ) {
			a[i] = inp.nextInt();
		}
		int pos = findNextHighest(a, element);
		System.out.println(a[pos] +" at "+ (pos+1));
		inp.close();
	}

	private static int findNextHighest(int[] a, int element) {
		int first = 0;
		int last = a.length-1;
		int ans = -1;
		
		while ( first <= last ) {
			int mid = first + (last-first)/2;
			if( a[mid] <= element ) {
				first = mid + 1;
			} else {
				ans = mid;
				last = mid - 1;
			}
		}
		return ans;
	}
}
