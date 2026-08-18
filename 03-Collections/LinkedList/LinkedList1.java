//import java.util.Collections;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();   // Creating a LinkedList
        list.add("Java");    // Adding elements to the LinkedList
        list.add("python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Rust");
                System.out.println(list);   
        list.remove("python");
        list.remove("Rust");       /// Removing elements from the LinkedList
                System.out.println(list);
        list.add("Dart");
                System.out.println(list);
        list.remove("C++");
        boolean a = list.contains("Java");
        boolean b = list.isEmpty();     /// Checking for elements and emptiness
        System.out.println(list);
        System.out.println(a);
        System.out.println(b);
         
    }
}