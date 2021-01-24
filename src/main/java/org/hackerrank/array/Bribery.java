package org.hackerrank.array;

import java.util.Scanner;

public class Bribery {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int n = q.length;
        int diff = 0;
        for ( int i = 0; i < n; i++ ) {
            int possDiff = Math.abs(q[i]-i);
            if( possDiff > 2 ) {
                System.out.println("Too chaotic");
                return;
            } else {
                diff += possDiff;
            }
        }
        System.out.println(diff/2);
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
