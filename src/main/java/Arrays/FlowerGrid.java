package Arrays;

import java.util.Arrays;

public class FlowerGrid {

    public static void main(String[] args) {
        String[][] solution = flowers(4);

        for(int i = 0; i < solution.length; i++) {
            System.out.println(Arrays.toString(solution[i]));
        }
    }

    private static String[][] flowers(int flowers) {
        String[][] flowerGrid = new String[0][0];

        String[] flowerTypes = new String[]{"A", "B", "C", "D", "E"};

        int rowLength = 2;

        for(int type = 0; type < flowers; type++) {
            String[][] newGrid = new String[rowLength][rowLength];

            for (int row = 0; row < rowLength; row++) { // row

                for(int element = 0; element < rowLength; element++) { // column

                    if(row == 0 || row == rowLength-1) { // only first and last row
                        newGrid[row][element] = flowerTypes[type];
                    }

                    else {
                        if(element == 0 || element == rowLength -1) { // first and last element
                            newGrid[row][element] = flowerTypes[type];
                        }
                        else { // use entry from flowerGrid
                            newGrid[row][element] = flowerGrid[row-1][element-1];
                        }
                    }
                }
            }
            flowerGrid = newGrid;
            rowLength += 2;
        }
        return flowerGrid;
    }
}
