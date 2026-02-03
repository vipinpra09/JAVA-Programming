class method{
    String greet(String name){
        return "hello" + name;
    }
}
class StringMethod{
    public static void main(String [] args){
        method m1 = new method();
        System.out.println(m1.greet(" Alexis"));
    }
}