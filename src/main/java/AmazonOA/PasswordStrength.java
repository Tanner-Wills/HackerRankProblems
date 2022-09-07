package AmazonOA;

import java.util.HashSet;

public class PasswordStrength {
    /*
    For each substring of the password which contains
    at least one vowel and one consonant, its strength goes up by 1.
    vowels={'a', 'e', 'i', 'o', 'u'}, and rest of letters are all consonant.
     */
    public static void main(String[] args) {
        String pass = "hackerrank";
        System.out.println(passwordStrength(pass));
    }

    public static int passwordStrength(String password) {
        int strength = 0;
        // create HashSet of all vowels.
        // iterate through the password
        // if a vowel is found, check either side of the vowel for constanants
        // if yes, increment strength
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] password_array = password.toCharArray();
        for (int i = 0;  i < password.length(); i++) {
            Character current = password_array[i];
            // found vowel
            if (vowels.contains(current)) {
                // far left side, only check right
                if (i == 0) {
                    if (!vowels.contains(password_array[i+1])) {
                        // consonant found, increment
                        strength ++;
                    }
                }
                // far right side, only check left
                else if (i == password.length()-1) {
                    if (!vowels.contains(password_array[i-1])) {
                        strength++;
                    }
                }
                // normal check for left / right
                Character left = password_array[i-1];
                Character right = password_array[i+1];
                if (!vowels.contains(left) || !vowels.contains(right)) {
                    strength++;
                }
            }
        }
        return strength;
    }
}
