import java.util.Scanner;

public class Input {
    int a;
    Scanner obj = new Scanner(System.in);

    public Input() {
        System.out.println("Enter a number:");
        a = obj.nextInt();
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("You entered: " + in.a);
    }
}
