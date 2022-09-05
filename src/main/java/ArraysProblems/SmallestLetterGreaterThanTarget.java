package ArraysProblems;

public class SmallestLetterGreaterThanTarget {
    /*
    Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
    Note that the letters wrap around.
    For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"

     */
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c: letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
    }
}
