class stu{
    String name;
    int age;
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String []args){
        stu s1 = new stu();
        s1.name="David";
        s1.age = 17;
        stu s2 = new stu();
        s2.name="Alex";
        s2.age = 19;
        s1.show();
        s2.show();
    }
}