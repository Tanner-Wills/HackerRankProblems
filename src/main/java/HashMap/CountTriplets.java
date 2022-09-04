package HashMap;

import java.util.*;

public class CountTriplets {

//    You are given an array and you need to find number of tripets of indices (i,j,k)
//    such that the elements at those indices are in geometric progression for a given common ratio r and i<j<k
//    Example:
//    arr = [1,4,16,64] r = 4
//    There are [1,4,16] and [4,16,64] at indices (0,1,2) and (1,2,3). Return 2.

    public static void main(String[] args) {
        int[] a = {1, 4, 16, 64};
        List<Long> arr = new ArrayList<>();
        for (int i : a) {
            arr.add((long) i);
        }
        long r = 4;

        long output = countTriplets(arr, r);
        System.out.println(output);
    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Integer> rightMap = new HashMap<>();
        Map<Long, Integer> leftMap = new HashMap<>();
        long numberOfGeometricPairs = 0;

        // populate rightMap
        for(Long num : arr) {
            rightMap.merge(num, 1, Integer::sum);
        }

        for (long val : arr) {
            long countLeft = 0;
            long countRight = 0;
            long lhs = 0;
            long rhs = val * r;
            if (val % r == 0) {
                lhs = val / r;
            }
            Integer occurence = rightMap.get(val);
            rightMap.put(val, occurence - 1);

            if (rightMap.containsKey(rhs)) {
                countRight = rightMap.get(rhs);
            }
            if (leftMap.containsKey(lhs)) {
                countLeft = leftMap.get(lhs);
            }
            numberOfGeometricPairs += countLeft * countRight;

            leftMap.merge(val, 1, Integer::sum);
        }
        return numberOfGeometricPairs;
    }
}
