
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Divisior  {
    public static void main(String[] args) {
        System.out.println(printDivisors(10));
    }
    static List<Integer>printDivisors(int n){
            // Write your code here
List<Integer> divisior = new ArrayList<Integer>();
for(int i=1;i<=(int)Math.sqrt(n);i++){
    if(n%i==0){
        divisior.add(i);
        if(n/i!=i){
            divisior.add(n/i);
        }
    }
}
 Collections.sort(divisior);
return divisior;
}
}
