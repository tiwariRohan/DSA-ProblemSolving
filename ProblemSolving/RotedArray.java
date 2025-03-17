import java.util.Arrays;

public class RotedArray {
    /* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. */
    static void rotate(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        k = k % nums.length;  // Ensure k is within the array length

        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (k > 0) {
                nums1[i] = nums[nums.length - k];
                k--;
            } else {
                nums1[i] = nums[j];
                j++;
            }
        }

        // Copy the rotated array back to the original array
        System.arraycopy(nums1, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
