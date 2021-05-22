package org.hackerrank.array;

import java.util.Scanner;

public class Bribery {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int bribes = 0;
        int n = q. length;
        for ( int i = 0; i < n; i++ ) {
            if ( ( q[i]-(i+1) ) <= 2 ) {
                if ( q[i] > (i+1) ) {
                    bribes += q[i] - (i+1);
                }
            } else {
                System.out.println("Too chaotic");
                return ;
            }
        }
        System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }
            minimumBribes(q);
        }
        scanner.close();
    }
}
