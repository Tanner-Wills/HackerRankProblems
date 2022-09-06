package AmazonOA;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        // hashmap to store the character, frequency of "chars"
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : chars.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int res = 0;

        // copy map to track the individual characters for each word
        // while iterating through the list of strings
        HashMap<Character, Integer> copyMap;
        for (String word : words) {
            // Copy the map
            copyMap = (HashMap<Character, Integer>) countMap.clone();
            // flag to track if the count should be incremented
            boolean fail = false;

            // for each char in the word, see if it is in the original map
            // if not, set boolean to true;
            for (char c : word.toCharArray()) {
                if (copyMap.get(c) == null || copyMap.get(c) <= 0) {
                    fail = true;
                    break;
                    // else, put the char int the copy map
                } else {
                    copyMap.put(c, copyMap.get(c) - 1);
                }
            }
            if (!fail) res += word.length();
        }
        return res;

    }
}
