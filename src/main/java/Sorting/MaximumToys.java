package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumToys {
    public static void main(String[] args) {
    List<Integer> prices = new ArrayList<>();
    prices.add(1);
    prices.add(2);
    prices.add(3);
    prices.add(4);

    int k = 7;

    int result = maximumToys(prices, k);

    System.out.println(result);
    }

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here


        int maxToys = 0;
        int total = 0;

        for (Integer price : prices) {
            if (total + price <= k) {
                maxToys += 1;
                total += price;
            }
        }
        return maxToys;
    }
}
