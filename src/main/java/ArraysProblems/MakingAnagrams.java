package ArraysProblems;

import java.util.HashMap;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        // Write your code here
        // log both strings into separate hashmaps
        // then iterate through each word and compare its frequency to the opposite map
        // each time a letter is found to not match, add it to the word bank to return
        HashMap<Character,Integer> mapA = new HashMap<>();
        HashMap<Character,Integer> mapB = new HashMap<>();

        for(Character A : a.toCharArray()) {
            mapA.merge(A, 1, Integer::sum);
        }
        for(Character B : b.toCharArray()) {
            mapB.merge(B, 1, Integer::sum);
        }

        int removes = 0;
        for(Character Acheck : a.toCharArray()) {
            if(mapB.containsKey(Acheck)) {
                mapB.put(Acheck, mapB.get(Acheck) -1 );
                if (mapB.get(Acheck) < 1 ){
                    mapB.remove(Acheck);
                }
            }
            else {
                removes ++;
            }
        }

        for(Character Bcheck : b.toCharArray()) {
            if(mapA.containsKey(Bcheck))  {
                mapA.put(Bcheck, mapA.get(Bcheck) -1);
                if (mapA.get(Bcheck) < 1) {
                    mapA.remove(Bcheck);
                }
            }
            else {
                removes ++;
            }
        }

        return removes;
    }

}
