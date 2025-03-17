import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,18,15,4,9,18,19};
        System.out.println(seachingRecursively3(arr,18,0));
    }
    static boolean seachingRecursively(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        
        return arr[index]==target||seachingRecursively(arr, target, index+1);

    }
    static int seachingRecursively2(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        
        if(arr[index]==target){
            return index;
        }
        return seachingRecursively2(arr, target, index+1);
        //return arr[index]==target||seachingRecursively(arr, target, index+1);

    }
    static List<Integer> list=new ArrayList<>();
    static List seachingRecursively3(int[] arr,int target,int index){
        if(index==arr.length){
            return list;
        }
        
        if(arr[index]==target){
            list.add(index);
        }
        return seachingRecursively3(arr, target, index+1);
        //return arr[index]==target||seachingRecursively(arr, target, index+1);

    }
}
