package AmazonOA;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalUnits = 0;
        Arrays.sort(boxTypes, ((a, b) -> b[1] - a[1]));

        for(int[] box : boxTypes) {
            while (box[0] > 0 && truckSize > 0) {
                totalUnits += box[1];
                truckSize--;
                box[0]--;
            }
        }
        return totalUnits;
    }
}
