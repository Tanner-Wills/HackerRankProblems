package AmazonOA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        // sort each row
        List<String> newGrid = new ArrayList<>();
        for (String string : grid) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sortedString = "";
            for (int i = 0; i < chars.length; i++) {
                sortedString += chars[i];
            }
            newGrid.add(sortedString);
        }

        // now check each column for being sorted
        for (int column = 0; column<newGrid.get(0).length(); column++) {
            String rawColumn = "";
            for (int row = 0; row < newGrid.size(); row ++) {
                rawColumn += newGrid.get(row).charAt(column);
            }
            char[] sortSetUp = rawColumn.toCharArray();
            Arrays.sort(sortSetUp);
            String sortedColumn = "";
            for (int j = 0; j < sortSetUp.length; j++) {
                sortedColumn += sortSetUp[j];
            }
            if(!rawColumn.equals(sortedColumn)) {
                return "NO";
            }

        }

        return "YES";
    }
}
