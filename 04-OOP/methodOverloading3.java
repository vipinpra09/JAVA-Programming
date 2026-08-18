// Online Java Compiler
//Method overLoading2
import java.util.Scanner;
class Calculator{
    int add(int a,int b, int c){
        return a+b+c;
    }
    int add(int a ,int b){
        return a+b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int mul(int a,int b,int c){
      return a*b*c;  
    }
}
class methodOverloading3{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = s1.nextInt();
         System.out.print("Enter Second number:");
        int b = s1.nextInt();
         System.out.print("Enter third number:");
        int c = s1.nextInt();
        System.out.println(c1.add(a,b));
        System.out.println(c1.mul(a,b));
        System.out.println(c1.add(a,b,c));
        System.out.println(c1.mul(a,b,c));
        

        
    }
}