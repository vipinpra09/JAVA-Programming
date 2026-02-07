import java.io.IOException;

public class CatchException {
    public static void main(String[] args) {
        try {
    int a = 10 / 0;
}
catch (IOException e) {   // ❌ won't run     // This catch block is for IOException, but the exception thrown is ArithmeticException, so this block will not execute.
    System.out.println("IO error");
}
catch (ArithmeticException e) { // ✅ will run
    System.out.println("Math error");
}

        
    }
    
}
