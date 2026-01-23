// inheritance in java
class Car{     //parent class
    public void show(){
        System.out.println("Car is a parent class....");
    }
}

class Bmw extends Car{     // child class
    void show1(){
              System.out.println("This is a BMW car....");
  
    }
}
class Toyota extends Car{   // child class
    void show2(){
      System.out.println("This is a toyota");

    }
}
public class  inheritance {
    public static void main(String [] args){
                    //constructor   
        Bmw b1 = new Bmw(); // object refrence variable
        Toyota t1 = new Toyota();
        b1.show(); // Inherited method
        t1.show2();//non inherited method or normal method
        b1.show1();// non inherited method or normal method
        t1.show(); // Inherited method
    }
}
