package AmazonOA;

public class RecursiveDigitSum {
    /*
    We define super digit of an integerusing the following rules:
    Given an integer, we need to find the super digit of the integer.
    If has only digit, then its super digit is
    Otherwise, the super digit of is equal to the super digit of the sum of the digits of

For example, the super digit of will be calculated as:
	super_digit(9875)   	9+8+7+5 = 29
	super_digit(29) 	2 + 9 = 11
	super_digit(11)		1 + 1 = 2
	super_digit(2)		= 2

     */
    public static int superDigit(String n, int k) {
        int sumAllDigits = sumEntireString(n)*k;
        while (sumAllDigits > 9) {
            sumAllDigits = sumEntireString(String.valueOf(sumAllDigits));
        }
        return sumAllDigits;
    }

    private static int sumEntireString(String n) {
        while (n.length() > 1) {
            int total = 0;
            for (int i = 0; i < n.length(); i++) {
                Character character = n.charAt(i);
                String string = character.toString();
                Integer integer = Integer.parseInt(string);
                total += integer;
            }
            n = String.valueOf(total);
        }
        return Integer.parseInt(n);
    }

    /*
    public static int superDigit(String n, int k) {
    // Write your code here
        Integer superD = compute(n) * k;
        n = superD.toString();
        while (n.length() > 1) {
            superD = compute(n);
            n = superD.toString();
        }
        return superD.intValue();
    }

    private static Integer compute(String n) {
        Integer sum = 0;
        while (n.length() > 1) {
            sum = 0;
            for (Character character : n.toCharArray()) {
                sum += Integer.parseInt(character.toString());
            }
            n = sum.toString();
        }
        return sum;
    }

     */
}
