import java.util.Scanner;
public class sum1{
    public static void main(String[]args){
        Scanner obj1 = new Scanner(System.in);
        //Scanner obj2 = new Scanner(System.in);
        //Scanner obj3=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = obj1.nextInt();
        System.out.println("Enter second number:");
        int b = obj1.nextInt();
        System.out.println("Enter third number:");
        int c = obj1.nextInt();
        int sum = a+b+c;
        System.out.print("Total sum is:"+sum);
        obj1.close();
    }
}
