import java.util.*;
class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
   Map<Integer, Integer> map = new LinkedHashMap<>();

        // Build frequency map
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Find the first non-repeating element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}