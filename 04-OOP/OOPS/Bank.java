// encapsulation
// Bank.java
// package bankapp
class bank{
    private int balance = 500;
    void dep(int amount){
        balance += amount;
    }
    void with(int amount){
        balance -= amount;
    }
    int check(){
        return balance;
    }
}
    class Bank{
        public static void main(String [] args){
            bank b = new bank();
            System.out.println("Your account balance is "+ b.check());
            b.dep(200);
            System.out.println("After deposit, your account balance is "+ b.check());
            b.with(100);
            System.out.println("After withdrawal, your account balance is "+ b.check());    
        }
    }
