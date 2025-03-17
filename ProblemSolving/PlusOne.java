import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(digitsSum(digits)));
    }
    public static int[] digitsSum(int[] digit){
       
        int rem=0;
        long remSum=0;
        for (int i = 0; i < digit.length; i++) {
            remSum=remSum*10+digit[i];
            
        }
      if(digit[0]==0){
        remSum=remSum*10;
      }
        remSum=remSum+1;
        long num=remSum;
        System.out.println(remSum);
       while (remSum>0) {
       
        rem++;

        remSum/=10;
       }
       System.out.println(rem);

       int[] sum=new int[rem];
       
       for (int i = rem-1; i >=0; i--) {
          int dig=(int)num%10;
          System.out.println(dig);
          if(dig==0){
            sum[i]=0;
          }

         else sum[i]=dig;
          num=num/10;
       }
        return sum;
    }
}
