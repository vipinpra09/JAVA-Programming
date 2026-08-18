public class method2 {
    String name;
    int marks;
    void show(){
        System.out.println(name);
        System.err.println(marks);
    }
    public static void main(String[] args) {
        method2 m2 = new method2();
        m2.name="Allice";
        m2.marks=56;
        m2.show();
    }
}
