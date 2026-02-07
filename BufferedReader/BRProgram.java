import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRProgram {

    public static void main(String[] args) {
        System.out.println("Available Text Files:");

        // Read available file list
        try (BufferedReader fileListReader =
                     new BufferedReader(new FileReader("FileName.txt"))) {

            String file;
            while ((file = fileListReader.readLine()) != null) {
                System.out.println(file);
            }

        } catch (IOException e) {
            System.out.println("Error reading file list.");
            return;
        }

        System.out.println("<------------------------------->");
        System.out.println("Enter name of text file to read (without extension):");

        // Read user input and file contents
        try (BufferedReader consoleReader =
                     new BufferedReader(new InputStreamReader(System.in))) {

            String fileName = consoleReader.readLine() + ".txt";
            File fileToRead = new File(fileName);

            if (!fileToRead.exists()) {
                System.out.println("Error: File does not exist.");
                return;
            }

            System.out.println("Contents of the file:");

            try (BufferedReader fileReader =
                         new BufferedReader(new FileReader(fileToRead))) {

                String line;
                while ((line = fileReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or file.");
        }
    }
}

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// class BRprogram {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedReader fr1 = new BufferedReader(new FileReader("FileName.txt"));
//         System.out.println("Available Text files:");
//         String files;
//         while((files = fr1.readLine()) != null){
//             System.out.println(files);
//         }
//         System.out.println("<------------------------------->");
//         System.out.println("Enter name of Text File to Read(just write File name without Extention):");
//         String name = br.readLine();
//         name = name+".txt";
//         BufferedReader fr = new BufferedReader(new FileReader(name));
//         String read;
//         System.out.println("Contents of the file:");
//         while((read = fr.readLine()) != null){
//             System.out.println(read);
//         }
//         br.close();
//         fr.close();
//     }
// }