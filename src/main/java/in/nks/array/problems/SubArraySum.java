package in.nks.array.problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = inp.nextInt();
		System.out.print("Enter sum : ");
		int sumExprected = inp.nextInt();
		int[] data = new int[n];
		System.out.print("Enter array : ");
		for (int i = 0; i<n; i++) {
			data[i] = inp.nextInt();
		}
		inp.close();
		int[] copiedData = Arrays.copyOf(data, data.length);
		findAnySum(copiedData, sumExprected);
	}

	private static void findAnySum(int[] copiedData, int sumExprected) {
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		dataSet.add(0);
		int sum = 0;
		int currPosition = 0;
		for (Integer num : copiedData) {
			sum+=num;
			if(dataSet.contains(sum-sumExprected)) {
				System.out.println("Given sum "+sumExprected+" SubArray exist");
				int position = 0;
				for (Integer sums : dataSet) {
					if(sums == (sum-sumExprected)) {
						break;
					} else position++;
				}
				System.out.print("Sub-Array : ");
				for (int i = position; i<= currPosition; i++) {
					System.out.print(copiedData[i]+" ");
				}
				return;
			}
			currPosition++;
			dataSet.add(sum);
		}
		System.out.println("Given sum SubArray doesn't exist");
	}
}

// 3 4 -7 3 1 3 1 -4 -2 -2 9
