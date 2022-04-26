import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        List<List<Integer>> sum = threeSum(nums);
        System.out.println(sum.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {




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
}
