package ArraysProblems;

import java.util.*;

import static java.util.stream.Collectors.joining;

class LeftRotation {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // brute force, one rotation at a time
        // store variable in a temp location
        if (a.size() < 2) {
            return a;
        }
        // new List<Integer> copy of a
        List<Integer> b = new ArrayList<>(a);

        // adjust rotation for d > a.size()
        while (d >= a.size()) {
            d -= a.size();
        }

        // rotate all positions at once
        for (int i = 0; i < a.size(); i++) {
            int newPos = a.size() - d + i;

            if (newPos >= a.size()) {
                newPos -= a.size();
            }

            // switch index
            b.set(newPos, a.get(i));
        }
        return b;
    }
}

