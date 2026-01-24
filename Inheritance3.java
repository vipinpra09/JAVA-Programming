// inheritance 
class car{
    void show() {
      System.out.println("This is parent class")  ;
      
    }
}
class honda extends car{
    void show1(){
        System.out.println("This is a child class");
    }
}
class Inheritance3{
    public static void main(String [] args){
        honda h = new honda();
        h.show();// parent class method (inherited)
        h.show1(); // child class method (own)
    }
}