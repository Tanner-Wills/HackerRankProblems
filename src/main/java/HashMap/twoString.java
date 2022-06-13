package HashMap;

import java.util.HashMap;

public class twoString {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        String answer = twoStrings(s1,s2);
        System.out.println(answer);
    }


    public static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i ++) {
            map.put(s1.charAt(i), i);
        }

        for (int j = 0; j < s2.length(); j++) {
            if(map.containsKey(s2.charAt(j))) {
                return "YES";
            }
        }
        return "NO";
    }

}
