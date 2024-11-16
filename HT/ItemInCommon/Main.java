package HT.ItemInCommon;

import java.util.HashMap;

public class Main {

    public static boolean itemInCommon(int[] array1,int[] array2) {
        HashMap<Integer, Boolean> newhash = new HashMap<Integer, Boolean>();
        for (int i = 0; i < array1.length; i++) {
            if (newhash.containsKey(array1[i])) {
            }
            else {
                newhash.put(array1[i], false);
            }
        }

        for (int j = 0; j < array2.length; j++) {
            if (newhash.containsKey(array2[j])) {
                newhash.put(array2[j], true);
            }
        }

        if (newhash.containsValue(true)) {
            return true;
        }
        else {
            return false;
        }
    }
    

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */
        
    }

}