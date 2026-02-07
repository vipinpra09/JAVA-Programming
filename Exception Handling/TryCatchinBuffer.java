import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TryCatchinBuffer {
    public static void main(String[] args) throws IOException  {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // br.close();     // If we close the BufferedReader here, it will throw an IOException when we try to read from it later in the code.
        
        System.out.print("Enter your Name:");
        String name = br.readLine();
        //br.close();  // Closing the BufferedReader here will also cause an IOException when we try to read from it again later in the code.
        System.out.println("Hello, " + name + "!");
        }
        catch(IOException e){
            System.out.println("Some error found");  // This will catch the IOException thrown when trying to read from a closed BufferedReader.
        }
    }
}