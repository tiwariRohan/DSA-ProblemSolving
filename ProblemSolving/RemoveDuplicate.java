import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int k=1;
        // int[] newArray=new int[nums.length];
        // newArray[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[k-1]){
                continue;
            }
            else{
                nums[k]=nums[i];
                k++;
            }
        }
       // int m=k;
        
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
