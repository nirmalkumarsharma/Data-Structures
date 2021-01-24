package org.geeksforgeeks.array;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int r = inp.nextInt();
		int[] a = new int[n];
		for( int i = 0; i < n; i++ ) {
			a[i] = inp.nextInt();
		}
		inp.close();
		cyclicRotatation(a,r);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	private static void cyclicRotatation(int[] a, int r) {
		int[] temp = new int[Math.abs(r)];
		int n = a.length;
		int start = (n + r) % n;
		if (r == 0) {
			return;
		}
		if (r > 0) {
			for (int i = 0; i < start; i++) {
				temp[i] = a[i];
			}
			int j = 0;
			for (int l = start; l < n; l++) {
				a[j++] = a[l];
			}
			for (int i = 0; i < r; i++ ) {
				a[j++] = temp[i];
			}
		} else {
			for (int i = start; i < n; i++) {
				temp[i-start] = a[i];
			}
			for (int i = n-1; i > Math.abs(r)-1; i--) {
				a[i] = a[i+r];
			}
			for (int i = 0; i<Math.abs(r); i++) {
				a[i] = temp[i];
			}
		}
	}
}
