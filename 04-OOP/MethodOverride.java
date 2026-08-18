// method overriding (runtime polymorphism)
class animal{
    void sound(){
        System.out.println("Animal Make Sounds...");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("Dog Bark ...");
    }
}
class cat extends animal{
    @Override
   void sound(){
        System.out.println("Cat Meow Meow ...");
    } 
}
public class MethodOverride{
    public static void main(String [] args){
        animal d = new dog();
        animal c = new cat();
        animal a = new animal();
        //animal a = new animal();
        d.sound(); // it calls the overridden method based on the object type   
        c.sound(); 
        a.sound();    
        
    }
}