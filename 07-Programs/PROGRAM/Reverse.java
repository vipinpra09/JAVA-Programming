class Reverse{
    int reverse(int num){
         int sum = 0;
        while(num > 0){
            int rem = num% 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        return sum;
    }
}
// class Test{
//     String name;
//     String address;
    
//     void show(){
//         System.out.println(name);
//         System.out.println(address);
//     }
// }
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
// Test t1 = new Test();
// t1.name = "Lisa";
// t1.show();
Reverse r1 = new Reverse();
int x = r1.reverse(143);
System.out.println(x);
	}
}
