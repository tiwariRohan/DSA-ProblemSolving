import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSorting(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean swap=false;
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                return;
            }
        }
    }

}
