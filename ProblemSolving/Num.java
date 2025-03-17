
public class Num{
    public static void main(String[] args) {
        int num=5, rem=0,number=0,count=0;
        while(num>0){
            rem=num%2;
            number=number*10+rem;
            num/=2;
            count++;
        }
        // System.out.println(number);
        long numb=0;
        rem=0;
        int i=0;
        // for( i=0;i<32-count;i++){
        //     numb+=(long)Math.pow(2,i)*0;
            
        // }
        // System.out.println(i+"\t"+number);
        for(i=32-count;i<=32 && number!=0;i++){
                rem=number%10;
                System.out.println(i);
                numb+=(long)Math.pow(2, i)*rem;
                 number=number/10;
                //  System.out.println(numb);
        }
        System.out.println(numb);

    }
}
