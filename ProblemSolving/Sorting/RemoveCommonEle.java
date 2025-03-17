import java.util.Arrays;

public class RemoveCommonEle {
    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        System.out.println(commonELement(nums));
    }

    public static int commonELement(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int count = 2;
        if (nums.length > 2)
        {
            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                } else {

                    --count;
                    if (count == 0) {
                        return nums[i - 1];
                    }
                }
            }
        }
    else{
            return nums[nums.length-1];
        }
        

        return nums[nums.length-1];
    }

}
