package Set.HasUniqueCharacters;

import java.util.HashSet;
import java.util.Set;


public class Main {

    public static Boolean hasUniqueChars(String str) {
        char[] chars = str.toCharArray();
        Set<Character> newSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (newSet.contains(chars[i])) {
                return false;
            }
            newSet.add(chars[i]);
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */
        
    }
    
}
