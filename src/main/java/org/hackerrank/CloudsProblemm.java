package org.hackerrank;

import java.io.*;
import java.util.*;

public class CloudsProblemm {

	static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        while(i < c.length) {
                if( (i + 2 < c.length) && c[ i + 2 ] == 0 ) {
                    i = i + 2;
                    System.out.println("i+2");
                    jumps++;
                } else if ( (i + 1 < c.length) && c[i + 1 ] == 0 ) {
                    i = i + 1;
                    jumps++;
                    System.out.println("i+1");
                } else {
                	break;
                }
        }
        return jumps;
    }


    public static void main(String[] args) throws IOException {
    	Scanner inp = new Scanner(System.in);
    	int n = inp.nextInt();
    	int[] c = new int[n];
    	for (int i = 0; i < n; i++) {
    		c[i] = inp.nextInt();
    	}
    	System.out.println(jumpingOnClouds(c));
    	inp.close();
    }
}

