import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // 1. Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // 2. Insert elements (key, value)
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println("Initial Map: " + map);

        // 3. Update value
        map.put(2, 50);  // key 2 updated
        System.out.println("After Update: " + map);

        // 4. Get value
        int value = map.get(2);
        System.out.println("Value at key 2: " + value);

        // 5. Safe get (avoids null)
        int safeValue = map.getOrDefault(4, 0);
        System.out.println("Value at key 4 (default): " + safeValue);

        // 6. Check if key exists
        if (map.containsKey(3)) {
            System.out.println("Key 3 exists");
        }

        // 7. Remove key
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // 8. Loop through keys
        System.out.println("Keys:");
        for (int key : map.keySet()) {
            System.out.println(key);
        }

        // 9. Loop through values
        System.out.println("Values:");
        for (int val : map.values()) {
            System.out.println(val);
        }

        // 10. Loop through key-value pairs
        System.out.println("Key-Value pairs:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + " -> " + val);
        }

        // 11. Frequency Count Example
        String str = "aabbc";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequency Map: " + freqMap);
    }
}
