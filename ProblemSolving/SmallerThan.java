import java.util.Arrays;

public class SmallerThan {
    public static void main(String[] args) {
        int[] arr={8,4,3,5,1,3};
        System.out.println();
        System.out.println(Arrays.toString(chhotaThan(arr)));
    }

    public static int[] chhotaThan(int[] nums){
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                //int max=Math.max(nums[i], nums[j]);
                if (nums[i]>nums[j]) {
                    count++;
                }
            }
            ans[i]=count;

        }
        return ans;
    }
    
}