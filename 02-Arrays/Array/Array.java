import java.util.Scanner;

class Array{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element is array:");
        int [] arr = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        
    }
}