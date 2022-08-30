package AmazonOA;

public class PalindromeIndex {
    static boolean isPalindrome(String str, int low, int high) {
        while (low < high) {
            if (str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    static int possiblePalinByRemovingOneChar(String str) {
        int low = 0;
        int high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            }
            else {
                if (isPalindrome(str, low + 1, high))
                    return low;

                if (isPalindrome(str, low, high - 1))
                    return high;
            }
        }
        return -1;
    }
}
