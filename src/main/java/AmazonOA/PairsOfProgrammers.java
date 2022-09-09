package AmazonOA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsOfProgrammers {

    public static void main(String[] args) {
        List<Integer> coders = new ArrayList<>();
        coders.add(6);
        coders.add(1);
        coders.add(9);
        coders.add(6);

        System.out.println(pairsWithSmallSort(coders,3));
    }


    public static List<Integer> pairswithMiddlePointer (List<Integer> coders, int k) {
        // sort array
        coders.sort((a,b) -> a - b);

        // two pointer starting from middle
        int L = 0;
        int R = coders.size();
        List<Integer> solution = new ArrayList<>();
        while (L < R) {
            int left = coders.get(L);
            int right = coders.get(R);
            int value = Math.abs(L-R);

        }
        return solution;
    }

    public static List<Integer> pairsWithSmallSort (List<Integer> coders, int k) {
        // brute force
        List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < coders.size(); i++) {
            for (int j = i + 1; j < coders.size(); j++) {
                int personA = coders.get(i);
                int personB = coders.get(j);
                int value = Math.abs(personA - personB);

                // if solution array is smaller than k
                if (solution.size() < 3) {
                    solution.add(value);
                }

                // else, sort and compare to biggest one
                else {
                    coders.sort((a,b) -> a - b);
                    if (value < solution.get(k-1)) {
                        solution.remove(k-1);
                        solution.add(value);
                    }
                }
            }
        }
        return solution;
    }
}
