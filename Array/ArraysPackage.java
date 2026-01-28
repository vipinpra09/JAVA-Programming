import java.util.Arrays;
import java.util.Scanner;
class ArraysPackage{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        // toString method for 1d array only
        
        int [] arr={1,2,5,4,3};
        System.out.println(Arrays.toString(arr));
        
        // deepToString for 2d array
        
        int [][] arr1 = {{1,3},{2,4}};
        System.out.println(Arrays.deepToString(arr1));
        
        // String sorting
        String []str = {"Allice","david","sofie","Venomous"};
                System.out.println(Arrays.toString(str));
                
         // binary search
        int[] arr2 = {10, 20, 30, 40};
        int index = Arrays.binarySearch(arr2,40);
        System.out.println(index);
        
        //Arrays.equals();
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        boolean res = Arrays.equals(a, b);
        System.out.println(res);
       // 
        int[][] arrr = {{1,2},{3,4}};
        int[][] arrr1 = {{1,2},{3,4}};
       System.out.println(Arrays.deepEquals(arrr, arrr1));


    }
}