public class method1{
       String name;
       int age;
       int id;
       String country;
       void show(){
           System.out.println("Name:"+name);
           System.out.println("Age:"+age);
           display();//cause of infinite method calling due to inisialise function in both
       }
       void display(){
           System.out.println("Id:"+id);
           System.out.println("Country:"+country);
           //show();   // Cause of infinite method Calling
       }
       public static void main(String []args){
           method1 m1 = new method1();
           method1 m2 = new method1();
           m1.name ="alex";
           m1.age=19;
           m1.country="Indonasia";
           m1.id=4567;
           m2.country="Lebia";
           m2.id=2345;
           m2.name = "david";
           m2.age=17;
           m1.show();
           //m1.display();
           
           //m2.show();
           //m2.display();
       }
}