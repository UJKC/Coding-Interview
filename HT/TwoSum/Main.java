package HT.TwoSum;

import java.util.*;

public class Main {
    
    public static int[] twoSum(int[] arr, int target) {
        // Create a HashMap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; // Calculate complement of current element
            
            // If complement is found in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return the pair of indices
            }
            
            // Otherwise, store the current element with its index in the map
            map.put(arr[i], i);
        }
        
        // Return null if no pair is found
        return new int[]{};
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); // [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10))); // []
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7))); // [2, 3]
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3))); // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0))); // []
    }
}
