package HashMap;

import java.lang.reflect.Array;
import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        String s = "abba";
        int nums = sherlockAndAnagrams(s);
        System.out.println(nums);
    }

    public static int sherlockAndAnagrams(String s) {
        int count = 0;

//        #1 Traverse all possible substrings within string
//        #2 Sort the substring by alphabetical order (this makes it easier to detect anagrams)
//        #3 Check if the substring is already in the map.
//        #3a If yes, increment the count and increment the key,value += 1 for the substring key
//        #3b If no, add the substring to the map with key,value = substring,1

        // #1
        Map<String, Integer> map = new HashMap<>(); // create hashmap
        for (int i = 1; i < s.length(); i ++) {
            for(int j = 0; j <= s.length() - i; j++) {
                String sub = s.substring(j,j+i);

                // #2
                System.out.println(sub);
                char[] chars = sub.toCharArray();
                Arrays.sort(chars);
                String sorted = "";
                for (char c : chars) {
                    sorted += c;
                }

                // #3
                if(map.containsKey(sorted)) { // consider time complexity of containsKey method
                    count += map.get(sorted);
                    map.put(sorted, map.get(sorted) + 1);
                    System.out.println("counted: " + sorted);
                }
                else {
                    map.put(sorted, 1);
                }
            }
        }
        return count;
    }
}
