public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};     //{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subSum(arr));
    }
    
    public static int subSum(int[] nums){
        int sum=0,count=0;
        int[] arr=new int[nums.length*nums.length];
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            // sum+=nums[i];
            // arr[i]=sum;
            // sum=0;
            // sum+=i<nums.length-1?nums[i+1]:0;
            // arr[i+1]=sum;
            // sum=0;
            // sum+=i<nums.length-1?nums[i+1]:0;
            // arr[i+1]=sum;
            sum=0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                //sum+=j<nums.length?nums[j]:0;
               // System.out.println(sum);
                arr[count]=sum;
                count++;
                max=Math.max(max,arr[count-1]);
            }
            
           
        }
        // for (int i = 0; i < count; i++) {
        //     max=Math.max(max, arr[i]);
        // }
        return max;
    }
}
