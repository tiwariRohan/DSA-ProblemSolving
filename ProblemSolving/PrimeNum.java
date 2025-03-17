
import java.util.ArrayList;
import java.util.List;

public class PrimeNum {
    public static void main(String args[]){
        System.out.println(primeNumber(78));
    }

    static boolean primeNumber(int n){
       
        for(int i=2;i<=(int)Math.sqrt(n);){
            if(n%i==0)
                return false;
            
        }
        return true;
    }
    
}
