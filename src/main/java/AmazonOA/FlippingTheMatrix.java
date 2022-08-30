package AmazonOA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingTheMatrix {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(112);
        row1.add(42);
        row1.add(83);
        row1.add(119);
        List<Integer> row2 = new ArrayList<>();
        row2.add(56);
        row2.add(125);
        row2.add(56);
        row2.add(49);
        List<Integer> row3 = new ArrayList<>();
        row3.add(15);
        row3.add(78);
        row3.add(101);
        row3.add(43);
        List<Integer> row4 = new ArrayList<>();
        row4.add(62);
        row4.add(98);
        row4.add(114);
        row4.add(108);
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        matrix.add(row4);
        System.out.println(flippingMatrix(matrix));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int size = matrix.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + Collections.max(Arrays.asList(
                        matrix.get(i).get(j),
                        matrix.get(i).get(size - 1 - j),
                        matrix.get(size - 1 - i).get(j),
                        matrix.get(size - 1 - i).get(size - 1 - j)));
                System.out.println("matrix.get(i).get(j) = " + matrix.get(i).get(j));
                System.out.println("matrix.get(i).get(size - 1 - j)  = " +  matrix.get(i).get(size - 1 - j));
                System.out.println("matrix.get(size - 1 - i).get(j) = " + matrix.get(size - 1 - i).get(j));
                System.out.println("matrix.get(size - 1 - i).get(size - 1 - j) = " + matrix.get(size - 1 - i).get(size - 1 - j));
            }

        }
        return sum;
    }
}
