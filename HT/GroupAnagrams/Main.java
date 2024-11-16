package HT.GroupAnagrams;

import java.util.*;

public class Main {

    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> returner = new ArrayList<>();
        if (strings.length == 0) {
            return returner; // Return an empty list if input is empty
        }

        // Use a HashMap where the key is the sorted string and the value is a list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strings) {
            // Sort the string to create a key for the anagram group
            char[] charArray = str.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            // Add the string to the appropriate group in the map
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        // Add all anagram groups from the map to the returner list
        returner.addAll(map.values());
        return returner;
    }

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }
}
