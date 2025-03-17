import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr={3,5,2,1,6,7,4};
        insertionSortingAlgo(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void insertionSortingAlgo(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1!=i){
                swap(nums,i,nums[i]-1);
                i--;
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
