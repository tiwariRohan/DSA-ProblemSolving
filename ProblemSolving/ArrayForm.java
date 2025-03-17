import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        int k=1;
        int[] num={9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(num, k));
    }
     public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> sum=new ArrayList<>();
        long  n=0;
        for (int i = 0; i < num.length; i++) {
            n=n*10+num[i];
        }
        System.out.println(n);
        n=n+k;

        // for(int i=num.length+1;i>0;i++){
            System.out.println(n);
        // }
        while(n>0){
            // int digit=(int) n%10;
            sum.add((int)(n%10));
            n=n/10;
        }
        Collections.reverse(sum);
        // Collection.reverse(sum);
        return sum;
    }
}
