package HourglassSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class HourglassSum {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // in a 6 x 6 array, there are 16 possible "hourglasses"
        // the hourglass is a 3 sections -> High (1x3), mid(middle only), low (1x3)
        // Sum this hourglass up, then compare to current max
        // slide the window over until next to the edge, then slide down & left (typewriter)

        int max = -81;
        int sum = 0;

        // High / Low range pointers
        int L = 0;
        int R = 3;

        // pointer to determine where the
        int rowPointer = 0;

        while(rowPointer < 4){
            while(R < 7) {
                // Sum high
                for(int i = L; i < R; i++) {
                    sum += arr.get(rowPointer).get(i);
                }

                // Sum mid
                sum += arr.get(rowPointer + 1).get(L + 1);

                // Sum low
                for(int j = L; j < R; j++) {
                    sum += arr.get(rowPointer + 2).get(j);
                }

                // check for max
                if(sum > max) {
                    max = sum;
                }

                sum = 0;
                L += 1;
                R += 1;
            }
            // increment pointer, reset L, R
            rowPointer += 1;
            L = 0;
            R = 3;
        }
        return max;
    }

}

