import java.util.LinkedList;
import java.util.List;

class LinkedL {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(2, 30);
        list1.add(3, 40);

        LinkedList<String> list = new LinkedList<>();
        list.add("A");         
        list.addFirst("B");    
        list.addLast("C");     
        list.add(1, "D");      

        System.out.println("Original list: " + list);

        list.remove();          // remove first element
        list.remove(1);         // remove element at index 1
        System.out.println("After removals: " + list);

        // Access elements safely
        if (!list.isEmpty()) {
            System.out.println("First: " + list.getFirst());
            System.out.println("Last: " + list.getLast());
        }

        System.out.println("List1: " + list1);
    }
}
