package Sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(6);
        a.add(4);
        a.add(1);

        countSwaps(a);

        System.out.println(a.toString());
    }

public static void countSwaps(List<Integer> a) {
    // track number of swaps
    int swaps = 0;

    // bubble sort
    for (int i = 0; i < a.size(); i++) {
        for (int j = 0; j < a.size() - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
            int first = a.get(j);
            int second = a.get(j + 1);
            if (first > second) {
                a.set(j,second);
                a.set(j+1,first);
                swaps += 1;
            }
        }
    }
    System.out.println("Array is sorted in " + swaps + " swaps.");
    System.out.println("First Element: " + a.get(0));
    System.out.println("Last Element: " + a.get(a.size()-1));
}
}
