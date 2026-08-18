class Armstrongnumber {
    boolean isarmstrong(long n){
       long org = n;
       long temp = n;
       int dig= 0;
       long res= 0,rem;
       while(temp > 0){
           temp /= 10;
           dig++;
       }
       while(n>0){
           rem = n%10;
           res += Math.pow(rem,dig);
           n/= 10;
       }
       if(res == org)
           return true;
       
       else
           return false;
       
       
    }
}
class Armstrong {
    public static void main(String[] args) {
    Armstrongnumber a = new Armstrongnumber();
    int count = 0;
    for(long i = 1 ;i<=100000;i++){
            boolean ans = a.isarmstrong(i);
            if(ans == true){
                count++;
    System.out.println(i + " is a Armstrong Number: "+ans);
            }

    }
        System.out.println("total Armstrong number between 1 and 100000 is:"+ count);
        

    }
}