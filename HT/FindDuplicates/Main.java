package HT.FindDuplicates;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> returner = new ArrayList<>();
        HashMap<Integer, Boolean> newHash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (newHash.containsKey(arr[i])) {
                newHash.put(arr[i], true);
            }
            else {
                newHash.put(arr[i], false);
            }
        }

        for (Map.Entry<Integer, Boolean> entry: newHash.entrySet()) {
            if (entry.getValue() == true) {
                returner.add(entry.getKey());
            }
        }

        return returner;
    }
      

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
        
    }

}
