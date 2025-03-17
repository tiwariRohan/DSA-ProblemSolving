import java.util.ArrayList;
import java.util.List;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(numsMissung(arr));
    }
    static List numsMissung(int[] arr){
        List<Integer> missing=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(arr[i]==arr.length) {
                i++;
                continue;
            }
            if(arr[i]!=i){
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                missing.add(j);
            }
        }
        return missing;
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
