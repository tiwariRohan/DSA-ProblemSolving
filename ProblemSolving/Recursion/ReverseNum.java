public class ReverseNum {
    public static void main(String[] args) {
       // System.out.println(revNum(1342));
       int digit=(int)Math.log10(1342)+1;
       //int base=1;
       
       System.out.println(rev2(1342,digit));
    }
    static int sum=0;
    static int revNum(int n){
        if(n==0){
            return sum;
        }
       int rem=n%10;
       sum=sum*10+rem;
       return revNum(n/10);
    }
    static int rev2(int n,int base){
         if(n%10==n){
            return n;
         }
         int rem=n%10;
         //why base-1 beacuse one number will be 1 itself rest should be zero
         return rem*(int)Math.pow(10, base-1)+rev2(n/10, base-1);
    }
}
