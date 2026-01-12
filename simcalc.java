import java.util.Scanner;
public class simcalc{
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a = s1.nextInt();
        System.out.print("Enter Second Number:");
        int b = s2.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int rem = a%b;
        int div = a/b;
        System.out.println("sum is:"+sum);
        System.out.println("substraction is:"+sub);
        System.out.println("multiplication is:"+mul);
        System.out.println("Remainder is:"+rem);
        System.out.println("Division is:"+div);
    }
}
