package org.amazon;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] num = new int[n];
        for( int i = 0; i < n; i++) {
            num[i] = inp.nextInt();
        }
        int start = 0;
        int end = n-1;
        int sq[] = new int[n];
        int j=n-1;
        while(start <= end){
            if(Math.abs(num[start]) < Math.abs(num[end])) {
                sq[j] = num[end]*num[end];
                end--;
            } else {
                sq[j] = num[start]*num[start];
                start++;
            }
            j--;
        }
        for( int i = 0; i < n; i++ ) {
            System.out.print(sq[i]+" ");
        }
        inp.close();
    }
}