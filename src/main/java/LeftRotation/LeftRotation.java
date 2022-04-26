//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'rotLeft' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY a
//     *  2. INTEGER d
//     */
//
//    public static List<Integer> rotLeft(List<Integer> a, int d) {
//        // brute force, one rotation at a time
//        // store variable in a temp location
//        if(a.size() < 2){
//            return a;
//        }
//        int done = 0;
//        int temp = a.get(1);
//        int first = a.get(0);
//        while(d >= a.size()) {
//            d -= a.size();
//        }
//
//        while(done < d){
//            for(int i = 0; i < a.size(); i++) {
//                if(i == a.size()-1){
//                    a.set(i,first);
//                }
//                else {
//                    a.set(i, temp);
//                }
//                // update holder variable
//                if(i < a.size() - 2){
//                    temp = a.get(i+2);
//                }
//            }
//            System.out.println(a.toString());
//            done += 1;
//            first = a.get(0);
//            temp = a.get(1);
//        }
//        return a;
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int d = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.rotLeft(a, d);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining(" "))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
