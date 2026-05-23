public class Main
{
    public static void main(String[] args)
    {
        try
        {
            
            
            
            int result = 10 / 0;   
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            // System.out.println("Exception occurred!");

            // prints full exception details
            e.printStackTrace();
        }

        System.out.println("Program continues...");
    }
}
