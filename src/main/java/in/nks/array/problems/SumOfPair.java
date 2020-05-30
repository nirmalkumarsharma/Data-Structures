package in.nks.array.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfPair {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = inp.nextInt();
		System.out.print("Enter sum : ");
		int sum = inp.nextInt();
		int[] data = new int[n];
		System.out.print("Enter array : ");
		for (int i = 0; i<n; i++) {
			data[i] = inp.nextInt();
		}
		inp.close();
		int[] copiedData = Arrays.copyOf(data, data.length);
		findPairsSort(copiedData, sum);
		findPairsHash(data, sum);
	}

	private static void findPairsHash(int[] data, int sum) {
		Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
		for ( int i = 0; i < data.length; i++) {
			if(dataMap.containsKey(sum-data[i])) {
				System.out.println("Hashing -> Pairs are at index : "+ i + "{"+ data[i] +"}" + " & "+ dataMap.get(sum-data[i]) + "{"+ (sum-data[i]) +"}");
			} else {
				dataMap.put( data[i], i );
			}
		}
	}

	private static void findPairsSort(int[] data, int sum) {
		Arrays.sort(data);
		
		int low = 0;
		int high = data.length-1;
		
		while(low<high) {
			if(data[low] + data[high] < sum)
				low++;
			if(data[low] + data[high] > sum)
				high--;
			if(data[low] + data[high] == sum) {
				System.out.println("Sorting -> Pairs are : "+data[low] +" & "+ data[high]);
				return;
			}
		}
	}
}
