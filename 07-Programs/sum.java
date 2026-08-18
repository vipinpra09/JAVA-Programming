import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print(" Enter first number:");
      int a = sc.nextInt();
     // System.out.println("You entered: " + a);
      Scanner sc1 = new Scanner(System.in);
      System.out.print(" Enter second number:");
      int b = sc1.nextInt();
      //System.out.println("You entered: " + b);
      int sum = a+b;
      System.out.println("sum is:"+sum);
      sc.close();
      sc1.close();
    }
}
