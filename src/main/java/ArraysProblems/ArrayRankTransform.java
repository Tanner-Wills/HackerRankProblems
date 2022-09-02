package ArraysProblems;


import java.util.*;

public class ArrayRankTransform {
    public int[] arrayRankTransform(int[] arr) {
        // put all elements into a dictionary
        // then iterate through the arr[] again and reference the rank
        // get sorted list
        Set<Integer> sortSet = new HashSet<>();
        for (int number : arr) {
            sortSet.add(number);
        }
        List<Integer> sortList = new ArrayList<>(sortSet);
        Collections.sort(sortList);

        System.out.println(sortList.toString());
        // create map of number, rank
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortList.size(); i++) {
            int num = sortList.get(i);
            if (!map.containsKey(num)) {
                map.put(num,i);
            }
        }

        System.out.println(map.toString());
        int[] result = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            int current = arr[j];
            int position = map.get(current);
            result[j] = position +1 ;
        }
        return result;
    }
}
