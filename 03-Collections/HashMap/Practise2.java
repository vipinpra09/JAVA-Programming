import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
    // Key always should be Unique
        map.put("Ram", 1234);
        map.put("David", 1234);
        map.put("Ross", 1234);
        map.put("Ram", 1234);
        map.put("Ram", 1234);
        map.put("Ram",12345);
        System.out.println(map);
    }
}
// Output
{David=1234, Ross=1234, Ram=12345}
