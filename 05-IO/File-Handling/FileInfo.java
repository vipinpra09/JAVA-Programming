import java.io.File;

public class Main {

    public static void main(String[] args) {

        File f = new File("test.txt");

        if(f.exists()) {

            System.out.println("File Name: " + f.getName());

            System.out.println("Path: " + f.getAbsolutePath());

            System.out.println("Writable: " + f.canWrite());

            System.out.println("Readable: " + f.canRead());

            System.out.println("Size: " + f.length() + " bytes");
        }
    }
}
