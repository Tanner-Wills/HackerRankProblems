package AmazonOA;

import java.util.Arrays;

public class MinimumSwapstoGroupAllOnesTogether {

    /*
    Sort 1's and 0's in array to the end. Either end is fine.
    Find the minimum number of adjacent swaps required to sort.

     */
    public static void main(String[] args) {
        int[] asdf = {0,0,0,0,1,0,1,0,0};
        System.out.println(minSwaps(asdf));
    }

    public static int minSwaps(int[] data) {
        int ones = Arrays.stream(data).sum();
        int cnt_one = 0, max_one = 0;
        int left = 0, right = 0;

        while (right < data.length) {
            // updating the number of 1's by adding the new element
            cnt_one += data[right++];
            // maintain the length of the window to ones
            if (right - left > ones) {
                // updating the number of 1's by removing the oldest element
                cnt_one -= data[left++];
            }
            // record the maximum number of 1's in the window
            max_one = Math.max(max_one, cnt_one);
        }
        return ones - max_one;
    }
}
