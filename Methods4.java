public class Methods4 {
    // Non static method call by creating object
    public void display(){
        System.out.println("Welcome to Java....");
    }
    public static void display1(){
        System.out.println("Welcome to Java....");
    }
    // Static Method call without creating object
    public static int add(int a,int b){
        return a+b;
    }
    // Non static Method call by creating object
    public long fact(int n){
        if(n == 0)
        return 1;
        else
        return n*fact(n-1);
    }
    public void fact1(int n){
        //int n = 6;
        if( n == 0){
            System.out.println("0");
        }
        else{
        int res = 1;
        while( n != 1){
            res *= n;
            n--;
        }
        System.out.println(res);
        }
    }
    public static void main(String[] args) {
        // Crearting object for non static method name m1
        Methods4 m1 = new Methods4();
        // Method call using object
        m1.display();
        int res = (int)m1.fact(5);
        System.out.println(res);
        int res1 = m1.add(5,67);
        System.out.println(res1);
       for(int i = 0;i<=20;i++){
       System.out.println("Factorial of ["+i+"] is "+m1.fact(i));
        } 
        int res2 =add(90,45);
        System.out.println(res2);
        display1();
        
    }
}