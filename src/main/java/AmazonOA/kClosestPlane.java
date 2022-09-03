package AmazonOA;

import java.util.*;

public class kClosestPlane {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Double> map = new HashMap<>();
        for (int j = 0; j < points.length; j++) {
            int[] point = points[j];
            map.put(j, distance(point));
        }

        List<Integer> topList = new ArrayList<>(map.keySet());
        topList.sort((a,b) -> (int) (map.get(a).compareTo(map.get(b))));
//        topList.sort((a,b) -> map.get(a).compareTo(map.get(b)));
//        topList.sort(Comparator.comparing(map::get));

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Integer key = topList.get(i);
            int[] value = points[key];
            result[i] = value;
        }

        return result;

    }

    private double distance(int[] point) {
        int X = point[0];
        int Y = point[1];

        double Xsquared = X*X;
        double Ysquared = Y*Y;

        double added = Xsquared + Ysquared;

        return Math.sqrt(added);
    }
}
