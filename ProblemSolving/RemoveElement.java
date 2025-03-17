import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={4,4,0,1,0,2};
        System.out.println(removeElement(arr, 0));
    }
    public static int removeElement(int[] nums, int val) {
        int count=1;
        int va=0;
        //Arrays.sort(nums);
         
        for (int i = 0; i < nums.length-va; i++) {
            if(nums[i]==val){
                swap(nums,i,nums.length-count);
                i--;
                count++;
                va++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-va;
    }
    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
