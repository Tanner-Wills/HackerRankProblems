package AmazonOA;

import java.util.List;

public class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int gas = 0;
        int distance = 0;
        int index = 0;
        for(int i=0; i < petrolpumps.size(); i++) {
            gas += petrolpumps.get(i).get(0);
            distance = petrolpumps.get(i).get(1);
            if(gas < distance) {
                // reset index to next point.
                index = i+1;
                gas =0;
            }
            else {
                gas -= distance;
            }
        }
        return index;
    }
}
