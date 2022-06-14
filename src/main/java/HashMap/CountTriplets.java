package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountTriplets {

//    You are given an array and you need to find number of tripets of indices (i,j,k)
//    such that the elements at those indices are in geometric progression for a given common ratio r and i<j<k
//    Example:
//    arr = [1,4,16,64] r = 4
//    There are [1,4,16] and [4,16,64] at indices (0,1,2) and (1,2,3). Return 2.

    public static void main(String[] args) {
        int[] a = {1,4,16,64};
        List<Long> arr = new ArrayList<>();
        for (int i : a) {
            arr.add((long) i);
        }
        long r = 4;

        long output = countTriplets(arr, r);
        System.out.println(output);
    }

    static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        long i = 0;
        long j = 0;
        long k = 0;

        // #1 Create a hashmap and count the quantities of each element in the list.
        HashMap<Long,Integer> countMap = new HashMap<>();
        for(Long l : arr) {
            if(countMap.containsKey(l)) {
                countMap.put(l, countMap.get(l) + 1);
            }
            else {
                countMap.put(l, 1);
            }
        }

        // #2


        return count;
    }

}
