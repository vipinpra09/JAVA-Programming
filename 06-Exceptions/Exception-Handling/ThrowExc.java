import java.util.Scanner;
public class Main {

    static void checkAge() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please inter Your Age: ");
       int age = sc.nextInt();
        if(age < 18) {
            throw new ArithmeticException("Not eligible");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        checkAge();
    }
}
