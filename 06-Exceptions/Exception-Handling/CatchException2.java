public class CatchException2 {

    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) { // This catch block will handle ArithmeticException specifically.
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) { // This catch block will handle any other exceptions.
            System.out.println("General error: " + e.getMessage());
        }
    }
    
}
