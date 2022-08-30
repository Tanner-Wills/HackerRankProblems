package AmazonOA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] sortedRubric = new int[100];
        for (int i = 0; i < arr.size(); i++) {
            Integer current = arr.get(i);
            sortedRubric[current]++;
        }
        // convert int[] to ArrayList
        List<Integer> list = Arrays.stream(sortedRubric).boxed().collect(Collectors.toList());
        return list;
    }

}
