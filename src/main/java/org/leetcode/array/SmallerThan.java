package org.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SmallerThan {
	public static void main(String[] args) {
		int[] nums = new int[] {6,9,3,8,6,5,2};
		int[] findSmaller = findSmaller(nums);
		for (int i : findSmaller) {
			System.out.print(i+"\s");
		}
	}

	private static int[] findSmaller(int[] nums) {
		int[] resultArr = new int[nums.length];
		for(int i = 0; i<nums.length; i++) {
			int count = 0;
			for(int j = 0; j<nums.length; j++) {
				if(nums[j]<nums[i]) {
					count++;
				}
			}
			resultArr[i] = count;
		}
		return resultArr;
	}
	public int thirdMax(int[] nums) {
        Set<Integer> numSet = new TreeSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        List<Integer> numList = new ArrayList<>(numSet);
        if(numList.size()<3){
            return numList.get(numSet.size()-1);
        } else {
            return numList.get(2);
        }
    }
	public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> birth = new HashMap<>();
        Map<Integer, Integer> death = new HashMap<>();
        
        for(int[] range: logs){
            if(birth.containsKey(range[0])){
                birth.replace(range[0], birth.get(range[0])+1);
            } else {
            	 birth.put(range[0], 1);
            }
            
            if(death.containsKey(range[1])){
            	death.replace(range[1], death.get(range[1])+1);
            } else {
            	death.put(range[1], 1);
            }
        }
        Set<Integer> years = new TreeSet<>();
        years.addAll(birth.keySet());
        years.addAll(death.keySet());
        
        int maxPopulation = 0;
        int maxPopulationYear = 0;
        int population = 0;
        for (Integer year : years) {
        	population += (birth.containsKey(year)?birth.get(year):0) - (death.containsKey(year)?death.get(year):0);
        	if(maxPopulation<population) {
        		maxPopulation=population;
        		maxPopulationYear = year;
        	}
		}
        return maxPopulationYear;
    }
}
