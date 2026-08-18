// ArrayList Example
import java.util.ArrayList;
class ArrayL{
    public static void main(String [] args){
        ArrayList<Integer> l = new ArrayList<>();   // make an ArrayList
        l.add(10);  // add elements
        l.add(20);   // add elements
        l.add(40);   // add elements
        l.add(40);
        int n1 = l.get(0);     // get element at index 0
        int n2 = l.size();     // size of ArrayList
        boolean a = l.contains(10);     // check if element is present
        int idx = l.indexOf(10);        // get index of element
        System.out.println(a);          // print true
        System.out.println(idx);      // print 0
        l.set(2,30);                  // set element at index 2
        l.remove(2);               // remove element at index 2
        l.remove(1);
        l.remove(0);        // remove element at index 0
        for(Integer i : l){          // iterate through ArrayList
            System.out.print(i+" ");
        }
            System.out.print("\n");
    
        System.out.println(n1);      // print 10

    }
}