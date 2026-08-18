// inheritance 
 class car{
    void show(){
        System.out.println("This is a parent class");
    }
}
class porche extends car{
    void show1(){
        System.out.println("This is a child1 class");
    }
}
class bmw  extends car{
    void show2(){
        System.out.println("This is a child2 class");
    }
}
class honda extends car{
    void show3(){
        System.out.println("This is a child3 class");
    }
}
public class inheritance1{
    public static void main(String [] args){
        porche p1 = new porche();
        bmw b1 = new bmw();
        honda h1 = new honda();
        p1.show();
        h1.show();
        b1.show();
        p1.show1();
        h1.show3();
        b1.show2();
        
    }
}