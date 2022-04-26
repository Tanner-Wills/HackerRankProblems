import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        //int[] nums = {0,0,0,0};
        int[] nums = {-2,0,1,1,2};
        int target = 9;
        List<List<Integer>> sum = threeSum(nums);
        System.out.println(sum.toString());
    }

    /**
     *  Three Sum
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        // return all triplets that have a sum == zero
        // BRUTE FORCE:
        // iterate through list with triple nested loop to see
        // all possible combos

        // OPTIMIZATION 1:
        // sort list
        // iterate starting at zero to length -2
        // have Left / Right pointers
        // while(Left < Right)
        // if(sum > 0) decrement Right pointer
        // if(sum < 0) increment Left pointer
        // if(sum == 0) store the triplet indexes in solution list
        // when Left == Right, increment loop iteration

        int n = nums.length;

        // Sort the numbers so that two pointers approach can be used
        Arrays.sort(nums);

        // List to store the result triplets
        List<List<Integer>> result = new LinkedList<>();

        /* Iterate from 0 to 3rd Last index because we cannot get a triplet for
        for the 2nd last and last index */
        for(int i=0; i<n-2; i++) {

            /* Since the numbers are sorted, and if current number
            is same as previous number, skip current number */
            if( i != 0 && nums[i-1] == nums[i] ) {
                continue;
            }

            /* Remaining number for the triplets will be picked from
            from the next number at {i+1} till last number at {n-1} */
            int left = i+1;
            int right = n-1;

            while(left < right) {

                /* If current number at {left} is same as the previous
                number, skip the number at current {left} index */
                if( left != i+1 && nums[left-1] == nums[left] ) {
                    left++;
                    continue;
                }
                /* If current number at {right} is same as the next
                number, skip the number at current {right} index  */
                if( right != n-1 && nums[right+1] == nums[right] ) {
                    right--;
                    continue;
                }

                // Calculate sum
                int sum = nums[i] + nums[left] + nums[right];

                // Add triplets to result, if current sum is 0
                if( sum == 0 ) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                // If sum is greater than 0, move {right} pointer to a lower number
                else if( sum > 0 ) {
                    right--;
                } else {
                    // Else sum is less than 0, move {right} pointer to a higher number
                    left++;
                }
            }
        }
        return result;
    }
}

    /**
     *  Two Sum
     */
//    public static int[] twoSum(int[] nums, int target) {
//
//        // create map of integers / indexes
//        // step through array
//        // check if compliment exists in map
//        // if so, return pair
//        // else, log that index in the map and continue
//
//        int[] pair = {0,1};
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++) {
//            if(map.containsKey(target - nums[i])) {
//                return new int[]{i, map.get(target - nums[i])};
//            }
//            else {
//                map.put(nums[i], i);
//            }
//        }
//        return pair;
//    }

