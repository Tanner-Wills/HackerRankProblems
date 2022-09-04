package AmazonOA;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZeroBySbtrackingEqualAmounts {
    public int minimumOperations(int[] nums) {
        Set<Integer> st = new HashSet();
        for(int i : nums) {
            if(i != 0) {
                st.add(i);
            }
        }
        return st.size();
    }
}
