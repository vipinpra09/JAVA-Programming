import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
class BufferFileReading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter name of Text File to Read:");
        String name = br.readLine();
        name = name+".txt";
        BufferedReader fr = new BufferedReader(new FileReader(name));
        String read;
        
        while((read = fr.readLine()) != null){
            System.out.println(read);
        }
        br.close();
        fr.close();
    }
}