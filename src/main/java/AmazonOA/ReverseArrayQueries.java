package AmazonOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayQueries {

    /*
    For a given array of integers, perform operations on the array.
    Return the resulting array after all operations have been applied in the order given.
    Each operation contains two indices. Reverse the subarray between those zero-based
    indices, inclusive.
     */

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int[] ints = {5,3,2,1,3};
        for (int i : ints) {
            arr.add(i);
        }

        List<List<Integer>> operations = new ArrayList<>();
        List<Integer> op1 = new ArrayList<>();
        op1.add(0);
        op1.add(1);
        operations.add(op1);
        List<Integer> op2 = new ArrayList<>();
        op2.add(1);
        op2.add(3);
        operations.add(op2);

        List<Integer> result = reverseArrayQueries(arr, operations);
        System.out.print(result.toString());
    }

    public static List<Integer> reverseArrayQueries(List<Integer> arr, List<List<Integer>> operations) {
        List<Integer> result = arr;
        for (List<Integer> ops : operations) {
            List<Integer> subList = arr.subList(ops.get(0), ops.get(1) +1);
            Collections.reverse(subList);

            int pointer = 0;
            for (int i = ops.get(0); i <= ops.get(1); i++) {
                arr.set(i,subList.get(pointer));
                pointer ++;
            }
        }
        return result;
    }
}

/*
Python
for operation in operations:
    i,j = operation
    sub_array = arr[i:j+1]
    sub_array.reverse()
    arr[i:j+1] = sub_array
return arr
 */
