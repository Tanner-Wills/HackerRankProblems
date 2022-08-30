package AmazonOA;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int topLeft = 0;
        int topDiagonal = 0;
        // calulate topLeft diagonal
        while (topLeft < arr.size()) {
            topDiagonal += arr.get(topLeft).get(topLeft);
            topLeft++;
        }

        int bottomIndex = arr.size()-1;
        int bottomRow = 0;
        int bottomDiagonal = 0;
        while (bottomRow < arr.size()) {
            bottomDiagonal += arr.get(bottomRow).get(bottomIndex);
            bottomIndex--;
            bottomRow++;
        }
        return Math.abs(topDiagonal-bottomDiagonal);
    }
}
