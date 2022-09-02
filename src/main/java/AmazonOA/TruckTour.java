package AmazonOA;

import java.util.List;

public class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int petrolLeft=0;
        int pet=0, dis=0;
        int index=0;
        for(int i=0; i < petrolpumps.size(); i++) {
            pet = petrolpumps.get(i).get(0);
            dis = petrolpumps.get(i).get(1);
            petrolLeft += pet;
            if(petrolLeft < dis)
            {
                // reset index to next point.
                index = i+1;
                petrolLeft =0;
            }
            else {
                petrolLeft -= dis;

            }
        }
        return index;
    }
}
