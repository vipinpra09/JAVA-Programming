import java.util.LinkedList;
import java.util.Queue;

class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  // Creating a Queue
        q.add(10);      // Adding elements to the Queue
        q.add(20);                  // Adding elements to the Queue
        q.offer(30);            // Adding elements to the Queue
        q.add(40);
        System.out.println(q);     //[10, 20, 30, 40]
        System.out.println(q.size());       // print size of Queue
        System.out.println(q.peek());    // returns the head element without removing it
                System.out.println(q.size());

        System.out.println(q.isEmpty());    // checks if the Queue is empty
        System.out.println(q.poll());       // retrieves and removes the head element of the Queue
        System.out.println(q.size());       // print size of Queue
        System.out.println(q);
                System.out.println(q.poll());    // retrieves and removes the head element of the Queue

                System.out.println(q.size());
        System.out.println(q);    //[30, 40]

    }
}