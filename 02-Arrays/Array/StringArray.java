import java.util.Arrays;
import java.util.Scanner;
class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of string array:");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String [] str = new String[n];
         System.out.println("enter Strings in string array:");

        for(int i = 0;i<n;i++){
            str[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
        // System.out.print("Enter size of array:");
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // System.out.println("Enter Element of Array:");
        // for(int i = 0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int [] arr ={12, 34, 55, 4, 3};
        // int [] arr2=arr.clone();
        // int []arr3 = new int[5];
        // Arrays.fill(arr3,10);
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr3));
        // System.out.println(Arrays.hashCode(arr3));
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("Sorted array: ");
        // System.out.println(Arrays.toString(arr));
        
        // System.out.println();
        // int b = Arrays.binarySearch(arr,12);
        // System.out.println("Element "+12+ " found at Index:"+ b);
        
        sc.close();
    }
}