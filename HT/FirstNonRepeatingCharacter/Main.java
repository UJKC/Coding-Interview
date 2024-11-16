package HT.FirstNonRepeatingCharacter;

import java.util.*;
import java.util.HashMap;


public class Main {
    
    public static Character firstNonRepeatingChar(String input) {
        int count = 0;
        HashMap<Character, Integer> newHash = new HashMap<>();
        char[] input1 = input.toCharArray();
        for (int i = 0; i < input1.length; i++) {
            if (newHash.containsKey(input1[i])) {
                count = newHash.get(input1[i]);
                count++;
                newHash.put(input1[i], count);
            }
            else {
                newHash.put(input1[i], 1);
            }
        }

        for (int j = 0; j < input1.length; j++) {
            for (Map.Entry<Character, Integer> en : newHash.entrySet()) {
                if (en.getValue() == 1) {
                    return en.getKey();
                }
                
            }
        }

        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
        
    }
    
}
