package org.leetcode.array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class OrderedStream {
    private Map<Integer,String> dataStream;
    private int maxReached;
    private int lastRead;

    public OrderedStream(int n) {
        this.dataStream = new LinkedHashMap<>();
        this.maxReached = 0;
        this.lastRead = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        if(idKey>this.maxReached) {
            this.maxReached = idKey;
        }
        dataStream.put(idKey, value);
        List<String> resultStream = new ArrayList<>();
        for(int i = lastRead+1; i<=maxReached; i++) {
            if(dataStream.containsKey(i)){
            	resultStream.add(dataStream.get(i));
            } else {
            	lastRead = i-1;
            	return resultStream;
            }
        }
        lastRead = maxReached;
        return resultStream;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */

public class DataStreaming {

	public static void main(String[] args) {
		OrderedStream os = new OrderedStream(5);
		System.out.println(os.insert(3, "ccccc")); // Inserts (3, "ccccc"), returns [].
		System.out.println(os.insert(1, "aaaaa")); // Inserts (1, "aaaaa"), returns ["aaaaa"].
		System.out.println(os.insert(2, "bbbbb")); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
		System.out.println(os.insert(5, "eeeee")); // Inserts (5, "eeeee), returns [].
		System.out.println(os.insert(4, "ddddd")); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
	}

}
