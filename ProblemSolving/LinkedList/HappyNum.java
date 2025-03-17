public class HappyNum {
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }
    public static boolean isHappy(int n){
        int s=n;
        int f=n;
        do{
            s=squareSum(s);
            f=squareSum(squareSum(f));
           
            if(f==s){
                return false;
            }
        }while(s!=f);
        if(s==1) return true;
        return false;
    }
    public static int squareSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*rem;
            num=num/10;
        }
        return sum;
    }
}
