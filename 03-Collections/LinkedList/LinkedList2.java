public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Linked List: " + list);
        
        // Remove an element
        list.remove(1); // Removes the element at index 1 (20)
        System.out.println("After removing element at index 1: " + list);
        
        // Get an element
        int element = list.get(0); // Gets the element at index 0 (10)
        System.out.println("Element at index 0: " + element);
    }
    
}
