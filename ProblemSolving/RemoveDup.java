
import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveDup {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        // numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        System.out.println(remove(numbers, 10));
        System.out.println(numbers);
    }
    static int remove( ArrayList<Integer> arr,int n){

     for (int i = 0; i < n; i++) {
        
        for(int j=i+1;j<n;j++){
            if(arr.get(i).equals(arr.get(j))){
                arr.remove(j);
                j--;
                n--;
            }
        }
     }   
        return n;
    }
}
