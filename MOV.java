// Java Program to demonstrate Method Overriding

//Method overLoading2
class Calculator{
    void show(){
        System.out.println("A Calculator Program...");
    }
}
//@Override   // runtime polymorphism
class add extends Calculator{
    void show(){
        System.out.println("This method add numbers");
    }
}
//@Override   // runtime polymorphism
class mul extends Calculator{
    void show(){
        System.out.println("This method multiply numbers");
    }
}
class sub extends Calculator{
    void show(){
        System.out.println("This method subtract numbers");
    }
}
class MOV {     
        // Method Overriding
    public static void main(String[] args) {    // main method
         //Scanner s1 = new Scanner(System.in);
        Calculator c1 = new Calculator();   // upcasting
        Calculator m = new mul();   // upcasting
        Calculator a1 = new add();   // upcasting
        Calculator s = new sub();   // upcasting
        
        c1.show();   // base class method
        a1.show();   // overridden method
        m.show();    // overridden method
        
        s.show();    // overridden method
        

        
    }
}