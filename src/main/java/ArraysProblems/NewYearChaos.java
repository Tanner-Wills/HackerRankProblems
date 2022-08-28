package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {

//    It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
//    Each person wears a sticker indicating their initial position in the queue from 1 to n.
//    Any person can bribe the person directly in front of them to swap positions,
//    but they still wear their original sticker. One person can bribe at most two others.
//    Determine the minimum number of bribes that took place to get to a given queue order.
//    Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

    public static void main(String[] args) {
        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
        List<Integer> q2 = new ArrayList<>();
        for (int i : q) {
            q2.add(i);
        }
        System.out.println(q2.toString());
        minimumBribes(q2);
    }


    public static void minimumBribes(List<Integer> q) {
        // Three pointer method
        int skipped = 0;
        int first = 1;
        int second = 2;
        int third = 3;

        for (int i = 0; i < q.size(); i++) {
            int personNumber = q.get(i);
            System.out.println("first: " + first);
            System.out.println("second: " + second);
            System.out.println("third: " + third);
            System.out.println("");

            if (personNumber == first) {
                first = second;
                second = third;
                third++;

            } else if (personNumber == second) {
                skipped++;
                second = third;
                third++;

            } else if (personNumber == third) {
                skipped += 2;
                third++;

            } else {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(skipped);
    }
}
