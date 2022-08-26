package AmazonOA;

import java.util.*;

public class SortTheSummary {
    /*
       Given an array of integers, create a 2-dimensional array where the first element is a
       distinct value from the array and the second element is that value's frequency within
       the array. Sort the resulting array descending by the frequency. If multiple values
       have the same frequency, they should be sorted ascending.
     */

    static class DescendingFrequency implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> a, List<Integer> b) {
            return b.get(1).compareTo(a.get(1));
        }
    }

    static class AscendingValue implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> a, List<Integer> b) {
            return b.get(0).compareTo(a.get(0));
        }
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int[] ints = {3,3,1,2,1};
        for (int i : ints) {
            arr.add(i);
        }

        List<List<Integer>> sorted = groupSort(arr);
        System.out.print(sorted.toString());
    }
    // HackerRank Sort the Summary
    public static List<List<Integer>> groupSort(List<Integer> arr) {
        // 1. create list of list: Integer, frequency
        // 2. sort by descending frequency
        // 3. sort by ascending value for values with matching frequency
        List<List<Integer>> result = new ArrayList<>();

        // create dictionary of integers and frequency
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer integer : arr) {
            map.merge(integer,1,Integer::sum);
        }

        // add all pairs to list
        for (Integer key : map.keySet()) {
            List<Integer> allPairs = new ArrayList<>();
            allPairs.add(key);
            allPairs.add(map.get(key));
            result.add(allPairs);
        }

        // sort the list (sort by tiebreaker first)
        Collections.sort(result, new AscendingValue());
        Collections.sort(result, new DescendingFrequency());

//        result.sort((a, b) -> a.get(0) - b.get(0));
//        result.sort((a, b) -> b.get(1) - a.get(1));

        return result;
    }
}
