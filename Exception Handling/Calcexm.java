
import java.util.Scanner;
class Calcexm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose a Operator(+,-,*,/):");
        String choice = sc.nextLine();
        System.out.print("Choose first Operand:");
        int a = sc.nextInt();
        System.out.print("Choose Second Operand:");
        int b = sc.nextInt();
        switch(choice){
            case "+":
        System.out.println("Sum of "+a+ " and "+b+" is :"+(a+b));
        break;
            case "-":
        System.out.println("Subtact of "+a+ " and "+b+" is :"+(a-b));
        break;
            case "*":
        System.out.println("Multiply of "+a+ " and "+b+" is :"+(a*b));
        break;
            case "/":
                if(b == 0){
                   try{
             b = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Can't devide with Zero");
            
        } 
                }
                else{
        System.out.println("Devide of "+a+ " and "+b+" is :"+(a/b));
                }
                break;
                default :
                System.out.printf("You choose Invalid Operator....");
                
        }
        sc.close();
    }
}