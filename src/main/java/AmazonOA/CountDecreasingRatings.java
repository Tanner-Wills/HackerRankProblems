package AmazonOA;

public class CountDecreasingRatings {

    /*
    Given an array of ratings for a product,
    count the number of intervals in which the ratings are consecutively decreasing.
    A single day rating is considered decreasing

    Ex.
    int[] ratings = {1};
    result = 1;
    */
    public static void main(String[] args) {
        int[] ratings = {4,3,10,4,3};
        // 5,4,3,2
        // 5,4,3
        // 5,4
        // 4,3,2
        // 3,2
        //
        System.out.println(countDecreasingRatings(ratings));
    }
    public static int countDecreasingRatings(int[] ratings) {
        int count = ratings.length;
        // pointer at start of window for "decreasing ratings"
        // pointer at end of window for "decreasing ratings"
        int start = 0;
        int end = 1;
        while (end < ratings.length) {
            // find difference of the last two numbers in the window
            // if the difference >= 1, they are decreasing
            // then increment the count by the size of the window
            if (ratings[end-1] - ratings[end] >= 1) {
                count += end - start;
            }
            // the difference is < 1, so they numbers are not decreasing
            // update the beginning of the window
            else {
                start = end;
            }

            // always increment the end of the window
            end ++;
            }
            return count;
        }
    }

