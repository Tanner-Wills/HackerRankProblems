package AmazonOA;

public class GreatestCommonDivisorOfStrings {
/*
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) { // make sure str1 is not shorter than str2.
            return gcdOfStrings(str2, str1);
        }else if (!str1.startsWith(str2)) { // shorter string is not common prefix.
            return "";
        }else if (str2.isEmpty()) { // gcd string found.
            return str1;
        }else { // cut off the common prefix part of str1.
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }

    /*
    public String gcdOfStrings(String str1, String str2) {
    if (!(str1+str2).equals(str2+str1))  return "";

    int gcdVal = gcd(str1.length() , str2.length());
    return str2.substring(0, gcdVal);
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
     */
}
