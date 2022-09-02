package AmazonOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrisonCells {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int repeat = findRepeat(cells,n);
        if (repeat > 0) {
            System.out.println("repeat = " + repeat);
            n = Math.floorDiv(n,repeat);
        }
        for (int i = 0; i <= n; i++) {
            int[] updateCells = new int[8];
            for (int j = 1; j < cells.length - 1; j++) {
                int left = cells[j - 1];
                int right = cells[j + 1];
                int sum = left + right;
                if (sum == 0 || sum == 2) {
                    updateCells[j] = 1;
                } else {
                    updateCells[j] = 0;
                }
            }
            List<Integer> list = new ArrayList<>();
            for (int num : cells) {
                list.add(num);
            }
            System.out.println("Day " + i + " : " + list.toString());
            cells = updateCells;
        }
        return cells;
    }

    private int findRepeat(int[] cells, int n) {
        HashMap<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] updateCells = new int[8];
            for (int j = 1; j < cells.length - 1; j++) {
                int left = cells[j - 1];
                int right = cells[j + 1];
                int sum = left + right;
                if (sum == 0 || sum == 2) {
                    updateCells[j] = 1;
                } else {
                    updateCells[j] = 0;
                }
            }
            cells = updateCells;
            if (map.containsKey(updateCells)) {
                return map.get(updateCells);
            }
            map.put(updateCells, i + 1);
        }
        return 0;
    }

    /*
    protected int cellsToBitmap(int[] cells) {
        int stateBitmap = 0x0;
        for (int cell : cells) {
            stateBitmap <<= 1;
            stateBitmap = (stateBitmap | cell);
        }
        return stateBitmap;
    }

    protected int[] nextDay(int[] cells) {
        int[] newCells = new int[cells.length];
        newCells[0] = 0;
        for (int i = 1; i < cells.length - 1; i++)
            newCells[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        newCells[cells.length - 1] = 0;
        return newCells;
    }

    public int[] prisonAfterNDays(int[] cells, int N) {

        HashMap<Integer, Integer> seen = new HashMap<>();
        boolean isFastForwarded = false;

        // step 1). run the simulation with hashmap
        while (N > 0) {
            if (!isFastForwarded) {
                int stateBitmap = this.cellsToBitmap(cells);
                if (seen.containsKey(stateBitmap)) {
                    // the length of the cycle is seen[state_key] - N
                    N %= seen.get(stateBitmap) - N;
                    isFastForwarded = true;
                } else
                    seen.put(stateBitmap, N);
            }
            // check if there is still some steps remained,
            // with or without the fast-forwarding.
            if (N > 0) {
                N -= 1;
                cells = this.nextDay(cells);
            }
        }
        return cells;
    }
}
     */
}
