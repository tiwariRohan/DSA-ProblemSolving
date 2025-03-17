public class SpecialXElemement {
    public static void main(String[] args) {
        int nums[]={3,5};
        System.out.println(specialElementInArray(nums));
    }
    static int specialElementInArray(int[] nums){
        int n;
        int count;
        for (int i = 1; i <= nums.length; i++) {
            count=i;
            n=nums.length;
            for (int j = 0; j < nums.length; j++) {
                if(count>nums[j]){
                    n--;
                }
            }
            //System.out.println(n);
            if(count==n){
                return count;
            }
        }
        return-1;
    }
}
