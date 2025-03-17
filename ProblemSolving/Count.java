
import java.util.Scanner;

public class Count{
    public static void main(String args[]){
        int n;
        System.out.println("eter a number");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println(countDigit(n));
    }
    // using string and log method also good
    // 


    static int countDigit(int n){


        // int digit= (int) (Math.log10(n)+1);
        // return digit;
        // String num=Integer.toString(n);
        // return num.length();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }


}