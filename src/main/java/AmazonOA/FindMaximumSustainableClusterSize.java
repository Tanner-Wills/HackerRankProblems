package AmazonOA;

public class FindMaximumSustainableClusterSize {

    /*
    Givin a maximum Power,
    group processor into groups of int[] to optimize power requirements
    power required for each index is processPower[i] + bootingPower[i]
    groups must be located adjacent to each other and cannot skip over indexes

    // net power consumption of a cluster is defined as:
    Max(bootingPower) + (sum of processPower in a cluster)

     */
    public static void main(String[] args) {
        int[] booting = {3,6,1,3,4};
        int[] process = {2,1,3,4,5};
        int max = 25;
        System.out.println(maxCluster(process,booting,max));
    }

    public static int maxCluster(int[] processPower, int[] bootingPower, int powerMax) {
        int maxClusterSize = 0;
        // sliding window (start and end pointer)
        // while start of window < int[].length - 1
        // store current utilized power in a variable
        // expand right of window until end is reached or power is exceeded
        // then compare the current cluster size to the maxClusterSize
        int L = 0;
        int R = 0;
        int currentCluster = 1;
        int powerLeft = powerMax;
        int booting = bootingPower[R];
        int process = 0;
        while (L < processPower.length) {
            // find booting power
            booting = Math.max(booting, bootingPower[R]);
            // sum process power
            process += processPower[R];
            // find powerleft
            powerLeft -= booting + process;

            // compare powerleft / increment cluster
            if (powerLeft < 0) {
                // compare clusters
                // increment L
                // reset variables
                maxClusterSize = Math.max(maxClusterSize, currentCluster);
                L++;
                R = L;
                powerLeft = powerMax;
                booting = bootingPower[R];
                process = 0;
                currentCluster = 0;
            }
            currentCluster++;
            R++;
            if (R >= processPower.length) {
                maxClusterSize = Math.max(maxClusterSize, currentCluster);
                L++;
                if (L < processPower.length) {
                    R = L;
                    powerLeft = powerMax;
                    booting = bootingPower[R];
                    process = 0;
                    currentCluster = 0;
                }
            }
        }
        maxClusterSize = Math.max(maxClusterSize, currentCluster);
        return maxClusterSize;
    }
}
