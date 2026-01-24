class employee{
    private int salery = 0 ;
    void set(int amount){
        salery  += amount;
    }
    int get(){
        return salery;
    }
    
}
class Company{
    public static void main(String [] args){
        employee e = new employee();
        System.out.println("Initial Salery: " + e.get());
        e.set(5000);
        System.out.println("After increment, Salery: " + e.get());
    }
}