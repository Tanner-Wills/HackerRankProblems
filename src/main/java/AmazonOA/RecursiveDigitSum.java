package AmazonOA;

public class RecursiveDigitSum {
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
