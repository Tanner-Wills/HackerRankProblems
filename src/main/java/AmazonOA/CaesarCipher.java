package AmazonOA;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        //define alphabet
        char[] alphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        //map of characters to their indices
        Map<Character, Integer> characterIndices = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            characterIndices.put(alphabet[i], i);
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)) {
                int oldIndex = characterIndices.get(Character.toLowerCase(c));
                int newIndex = (oldIndex + k) % 26;
                char newChar = alphabet[newIndex];
                if(Character.isLowerCase(c)) builder.append(newChar);
                else builder.append(Character.toUpperCase(newChar));
            }
            else builder.append(c);
        }
        return builder.toString();
    }
}


