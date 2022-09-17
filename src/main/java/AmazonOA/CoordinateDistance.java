package AmazonOA;

public class CoordinateDistance {
    public static void main(String[] args) {
        int[][] points = new int[3][2];
        int[] point1 = {0,1};
        int[] point2 = {1000,1};
        int[] point3 = {5,5};
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        int k = 2;

        System.out.println(coordinates(points, k));
    };

    // brute force
    // List<Integer> result
    // iterate through the list, caluculate the linear distance
    // compare to the furthest point in result list.

    // optimized approach
    // initialize a heap object
    // custom comparator to have the furthest linear distance as the root node
    // iterate through the list
    // if heap size < k add it to the heap
    // if size == k, then compare the current point to the root node, if current < root, pop off root, and add in current
    // add the nodes to a list and return

    public static List<List<Integer>> coordinates(int[][] points, int k) {

        Comparator<List<Integer>> reversed = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                int l1_dist = linearDist(l1);
                int l2_dist = linearDist(l2);

                if (l2_dist < l1_dist) {
                    return 1;
                }
                if (l2_dist > l1_dist) {
                    return -1;
                }
                else {
                    return 0;
                }

            };
        };
        TreeSet<List<Integer>> heap = new TreeSet<List<Integer>>(reversed);
        for (int i = 0; i < points.length; i++) {
            int[] currentPoint = points[i];
            List<Integer> pointList = new ArrayList<>();
            pointList.add(currentPoint[0]);
            pointList.add(currentPoint[1]);
            int current_Dist = linearDist(pointList);


            if (heap.size() < k) {
                heap.add(pointList);
            }
            else {
                int root_Dist = linearDist(heap.first());
                if (current_Dist < root_Dist) {
                    heap.pollFirst();
                    heap.add(pointList);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        while (heap.size() > 0) {
            result.add(heap.pollFirst());
        }
        return result;
    }


    private static int linearDist(List<Integer> points) {
        int x = points.get(0);
        int y = points.get(1);
        return (int)Math.sqrt((x*x) + (y*y));
    }

}
}
