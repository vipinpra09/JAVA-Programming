// polimorphism
class calculator{
    int add(int a,int b){
        return a+b;
        
    }
    float add(float a , float b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
    double mul(int a , int b){
        return a*b;
    }
    double mul(int a, int b ,int c){
        return a*b*c;
    }
    int mul(int a){
        return a*a;
    }
}
   public class Calculator{
       public static void main( String [] args){
           calculator c = new calculator();
           System.out.println("Addition of 2 numbers: " + c.add(5, 10));
           System.out.println("Addition of 3 numbers: " + c.add(5, 10, 15));
           System.out.println("Multiplication of 2 numbers: " + c.mul(5, 10));
           System.out.println("Multiplication of 3 numbers: " + c.mul(5, 10, 15));
           System.out.println("Addition of 2 float numbers: " + c.add(5.5f, 10.5f));
       }
   }