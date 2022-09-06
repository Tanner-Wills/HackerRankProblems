package AmazonOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RelativeSortOfArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // new int[] to store values as they sort
        int[] sorted = new int[arr1.length];
        // hashmap to store the value . frequency of each value in arr1
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr1) {
            map.merge(i,1,Integer::sum);
        }
        // pointer to point to arr2
        int pointer = 0;
        // step through arr2, and add them in order to the new in[]
        // repeat for the required frequency in the map
        for (int j = 0; j < arr2.length; j++) {
            int current = arr2[j];
            while(map.containsKey(current)) {
                sorted[pointer] = current;
                pointer ++;
                map.put(current, map.get(current) - 1);
                if (map.get(current) < 1) {
                    map.remove(current);
                }
            }
        }
        // after going through the entire arr2 array, then take the unused keys and sort them in ascending order
        // add them to the back of the new array
        List<Integer> sortedList = new ArrayList<>();
        for (Integer keys : map.keySet()) {
            int amount = map.get(keys);
            while(amount > 0) {
                sortedList.add(keys);
                amount --;
            }
        }
        Collections.sort(sortedList);
        for (Integer k : sortedList) {
            sorted[pointer] = k;
            pointer++;
        }
        return sorted;
    }
}
