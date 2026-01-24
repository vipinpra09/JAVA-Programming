// method overloading(Compile time polymorphism)
import java.util.Scanner;
class Area{
    double area( int l,int w){
        return l*w;
    }
    double area(int r){
        return 3.14*r*r; 
    }
    double area(int l ,int b,int h){
        return l*b*h;
    }
}
class MethodOverload{
    public static void main(String [] args){
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, radius, breadth, and height:");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Area of rectangle is "+ a.area(l,w));
        System.out.println("Area of circle is "+ a.area(r));
        System.out.println("Area of cuboid is "+ a.area(l,b,h));
    }
}