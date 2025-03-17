
import java.util.Scanner;

class ReverseANum{
    public static void main(String args[]){
        int n;
        System.out.println("enter number=");
        Scanner enter=new Scanner(System.in);
        n=enter.nextInt();
        System.out.println(reverseNum(n));
    }

    static int reverseNum(int n){
        int newNUm=0;
        int digit=0;
        while(n>0){
            digit=n%10;
            n=n/10;
            
            newNUm=newNUm*10+digit;
        }
        return newNUm;
    }
}