package HeapPriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementInStream {
    private static int k;
    private PriorityQueue<Integer> heap;

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();

        for (int num: nums) {
            heap.offer(num);
        }

        while (heap.size() > k) {
            heap.poll();
        }
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }

        return heap.peek();
    }
}

}
