// Encapsulation
class bank{
    private int balance;
     
     public void deposit(int amount){
         balance += amount;
     }
     public void withdraw(int amount){
         balance -= amount;
     }
     public int showbalance(){
         return balance;
     }
     
}
public class encapsulation {
    public static void main(String [] args){
        bank account = new bank();
        int bal = account.showbalance();
        System.out.println("Your balance is: " + bal);
        account.deposit(5000);
        System.out.println("After depositing 5000, your balance is: " + account.showbalance());
        account.withdraw(2000);
        System.out.println("After withdrawing 2000, your balance is: " + account.showbalance());
    }
}