import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        System.out.println(Arrays.toString(arraySum(arr)));
    }
    static int[] arraySum(int[] nums){
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            
            ans[i]=ans[i-1]+nums[i];
            
        }
        return ans;
    }
}
