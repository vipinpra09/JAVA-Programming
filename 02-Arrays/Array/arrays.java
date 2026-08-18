
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
     System.out.println((int)(Math.random() *10000));
     int arr[]={145,25,38,4,50};
     //System.out.println(arr[0]);
     Arrays.sort(arr);
     for(int i = 0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
     System.out.println(Arrays.binarySearch(arr,145));
    }
    
}