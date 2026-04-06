import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,4);
        map.put(1,6);
        map.put(2,5);
        map.put(3,7);
        System.out.println(map);
        map.put(1,10);
        System.out.println(map);
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.containsKey(0));
        System.out.println(map.containsKey(6));
        map.remove(1);
        System.out.println(map);
        System.out.println(map);
        
    }
}
// Output
{0=4, 1=6, 2=5, 3=7}
{0=4, 1=10, 2=5, 3=7}
4
10
true
false
{0=4, 2=5, 3=7}
{0=4, 2=5, 3=7}

=== Code Execution Successful ===
