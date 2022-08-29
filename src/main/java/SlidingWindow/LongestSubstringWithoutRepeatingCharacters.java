package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
    Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap();
        int left = 0;
        int right = 0;
        int res = 0;
        // index R to the right
        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r,0) + 1);
            // if r.get > 1, keep sliding L++ unitl r.get < 1;
            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }
            // compare and index r++;
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
