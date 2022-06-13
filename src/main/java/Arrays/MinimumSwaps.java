package Arrays;

import java.util.Arrays;

public class MinimumSwaps {
    // Complete the minimumSwaps function below.

    public static void main(String[] args) {
        int[] arr = {7,1,3,2,4,5,6};
        int min = minimumSwaps(arr);
        System.out.println(min);
    }

    static int minimumSwaps(int[] arr) {
        int currentMin = 1;
        int currentInd = 0;
        int swaps = 0;
        while (currentMin < arr.length) {
            for (int i = currentInd; i < arr.length; i++) {
                if (arr[i] == currentMin) {
                    if (i == currentInd) { // It is already sorted
                        currentInd++;
                        currentMin++;
                        break;
                    }
                   // swap
                    int temp = arr[i];
                    arr[i] = arr[currentInd];
                    arr[currentInd] = temp;

                    swaps++;
                    currentInd++;
                    currentMin++;
                }
            }
        }
        return swaps;
    }
}

