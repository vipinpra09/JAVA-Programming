import java.util.HashSet;
import java.util.Set;
class Hashset {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);   // Adding elements to the HashSet
        s.add(20);        // Adding elements to the HashSet
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(10);
        s.add(10);          // Duplicate elements are not added
        s.add(60);
        s.add(null);            // Adding null value
        s.add(null);        // Adding null value
        s.remove(10);       // Removing an element from the HashSet
        
        System.out.println(s);      // Printing the HashSet
        System.out.println(s.isEmpty());        // Checking if the HashSet is empty
        System.out.println(s.size());           // Getting the size of the HashSet
        
        
        
    }
}