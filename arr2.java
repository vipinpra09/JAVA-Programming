
import java.util.Arrays;
import java.util.Scanner;
public class arr2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int n = s1.nextInt();
        int []arr = new int[n];
        System.out.println("Enter Element In Array:");
        for(int i = 0;i<n;i++){
            System.out.print("Enter element at Index ["+i+"]:");
            arr[i]=s1.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is:");
        for(int i :arr){
            System.out.println(i);
        }
    }
}
