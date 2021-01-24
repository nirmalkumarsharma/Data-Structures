package org.hackerrank.hashtables;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineWordCount = new HashMap<>();
        for ( String magazineWord : magazine ) {
            if( !magazineWordCount.containsKey(magazineWord) ) {
            	magazineWordCount.put(magazineWord, 1);
            } else {
            	int count = magazineWordCount.get(magazineWord);
                magazineWordCount.replace(magazineWord, count+1);
            }
        }
        for ( String noteWord : note) {
            if ( magazineWordCount.containsKey(noteWord) ) {
            	int count = magazineWordCount.get(noteWord);
            	if (count > 0) {
            		magazineWordCount.replace(noteWord, count-1);
            	} else {
            		System.out.println("No");
            		return;
            	}
            } else {
            	System.out.println("No");
        		return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) throws FileNotFoundException {
    	Scanner scanner = new Scanner(System.in);
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        String[] magazine = new String[m];
        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }
        String[] note = new String[n];
        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }
        checkMagazine(magazine, note);
        scanner.close();
    }
}
