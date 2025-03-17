import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PassingListInFun {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,4,8};
        System.out.println(indexes(arr, 4, 0));
    }
    static ArrayList indexes(int[] arr, int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall= indexes(arr, target, index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }
}
