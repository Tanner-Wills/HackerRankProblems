package AmazonOA;

public class ReverseKCharacterString {
    // reverse the first k charcters for every 2k characters counting from the start.
    // if there are fewer than k characters left, reverse them all
    // if there are less than 2k but >= k characters, then reverse the first k characters
    // and leave the others as original

    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}

