
import java.util.Stack;
class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();   // Creating a Stack
        s.push(10);  // Pushing elements onto the Stack
        s.push(20);             // Pushing elements onto the Stack
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);   //[10, 20, 30, 40, 50]
        System.out.println(s.pop());   //50
        System.out.println(s.peek());   //40
        System.out.println(s); //[10, 20, 30, 40]
        boolean a = s.isEmpty();     //false
        boolean b = s.contains(20);   //true
        boolean c = s.empty();     //false
        int d = s.firstElement();   //10
        int e = s.lastElement();    //40
        int f = s.size();          //4
        s.set(0,11);     // set method
        s.remove(0);    // remove method
        s.add(50);   // add method
        s.clear();   // clear method
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);
        System.out.println(s);    //[]
        

        
        
    }
}