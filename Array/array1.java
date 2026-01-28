
import java.util.Arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner i1= new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = i1.nextInt();
        int[] arr1=new int[n];
        
        for(int i = 0;i<n;i++){
            arr1[i]=i1.nextInt();
        }
        int arr[]={23,34,56,67,34,78};
        for(int i = 0;i<arr.length;i++){
            System.out.println("Element at Index ["+(i)+"] is "+arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Array After Sorting:");
        for(int i = 0;i<arr.length;i++){
            System.out.println("Element at Index ["+(i)+"] is "+arr[i]);
        }
        
        
    }
}
