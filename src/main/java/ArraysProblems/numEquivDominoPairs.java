package ArraysProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class numEquivDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        int matches = 0;
        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            List<Integer> forward = new ArrayList<>();
            forward.add(a);
            forward.add(b);
            List<Integer> backward = new ArrayList<>();
            backward.add(b);
            backward.add(a);

            if (map.containsKey(forward)) {
                int match = map.get(forward);
                matches += match;
                map.merge(forward, 1, Integer::sum);
            }
            else if (map.containsKey(backward)) {
                int matchAlternative = map.get(backward);
                matches += matchAlternative;
                map.merge(backward, 1, Integer::sum);
            }
            else {
                map.merge(forward, 1, Integer::sum);
            }
        }
        return matches;
    }
}
