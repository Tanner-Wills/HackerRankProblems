package ArraysProblems;

import java.util.*;

import static java.util.stream.Collectors.joining;

class FraudulentActivityNotifications {

    /*
    Description
    HackerLand National Bank has a simple policy for warning clients
    about possible fraudulent account activity. If the amount spent
    by a client on a particular day is greater than or equal to
    the client's median spending for a trailing number of days,
    they send the client a notification about potential fraud.
    The bank doesn't send the client any notifications until they
    have at least that trailing number of prior days' transaction data.
    Given the number of trailing days and a client's total
    daily expenditures for a period of days, determine the number
    of times the client will receive a notification over all days.
     */

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int L = 0;
        int R = d;
        int median = 0;
        int notifications = 0;

        if(d >= expenditure.size()) {
            return 0;
        }
        // max value of expenditure list
        int max = 0;
        for (Integer integer : expenditure) {
            if(integer > max) {
                max = integer;
            }
        }
        // create list of zeroes
        List<Integer> list = new ArrayList<Integer>(Collections.nCopies(max + 1, 0));

        for(int i = d; i < expenditure.size(); i++) {

            // create frequency bins
            for (int Left = L; Left < R; Left++) {
                list.set(expenditure.get(L), list.get(L) + 1);
            }
            // sliding window, rolling sum
            int rollingSum = 0;

            //find median
            if(d%2 == 0) { // even

                // average of two middle values
            }
            else { // odd
                // middle value of sublist
            }
            if(expenditure.get(i) >= median*2) {
                notifications += 1;
            }
            L += 1;
            R += 1;
        }
        return notifications;
    }
}


