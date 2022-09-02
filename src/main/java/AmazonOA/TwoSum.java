package AmazonOA;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // create map
        // search through array,
        // subtract the current num from the target and search the map,
        // if a hit exists, return the pair
        // if not, store the current in the map with the value == index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (!map.isEmpty()) {
                int balance = target - current;
                if (map.containsKey(balance)) {
                    int[] found = {i, map.get(balance)};
                    return found;
                }
            }
            map.put(current,i);
        }
        return null;
    }
}
