import java.util.ArrayList;
class StringAl {
    public static void main(String[] args) {
     ArrayList<Integer> arr = new ArrayList<>();    // make an Integer ArrayList
     arr.add(10);      // add elements
     arr.add(20);      // add elements
     arr.add(2,20);      // add element at index 2
     ArrayList<String> str = new ArrayList<>();      // make a String ArrayList
     str.add("Java");
     str.add("Python");     // add elements
     str.add("C++");        // add elements
     str.add("Rust");       // add elements
     str.add("LUA");
     System.out.println(str);       // print ArrayList
     System.out.println(str.toString());        // print ArrayList using toString() method
     str.forEach(System.out :: println);    // iterate through ArrayList using forEach and method reference
     System.out.println(String.join(" | ",str));    // join elements of ArrayList with " | " separator
     str.remove("Java");    // remove element "Java"
     str.remove(0);     // remove element at index 0
     String b = str.get(0);     // get element at index 0
     System.out.println(b);      // print element at index 0
     
     int a = arr.get(0);
     System.out.println(a);
     for(Integer i :arr){
         System.out.print(i+" ");
     }
    }
}