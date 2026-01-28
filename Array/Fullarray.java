import java.util.Arrays;
import java.util.Scanner;
class Fullarray{
    public static void main( String[] args){
        
        
        // Taking input in an array
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter Element at Index["+i+"]:");
            arr[i] = sc.nextInt();
        }
        
        // sorting array through Arrays build in package...
        
        
       Arrays.sort(arr);
       System.out.println("Sorted array:");
       for(int i:arr){
       System.out.println(i);
           
       }
       // 2d array
       // int [][] arr3 = new int[size][size] ;
       
       // copy array...
       
       int []arr2 = arr.clone();
       for(int i : arr2){
           System.out.println("Element is "+i);
       }
    }
}