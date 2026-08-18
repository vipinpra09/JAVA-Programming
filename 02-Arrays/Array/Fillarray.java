import java.util.Arrays;

public class Fillarray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Arrays.fill(arr,15);
        for(int i:arr){
            System.out.print(i+" ");
        }
        int [] arr1 = {1,2,3,4,5};
        System.out.printf("\n");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}