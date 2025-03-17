public class SearchinRotedArr {
    public static void main(String[] args) {
       int[] nums={4,5,6,7,0,1,2};
       System.out.println(indexOfElement(nums,0)); 
    }
    public static int indexOfElement(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid-1]){
                return nums[mid-1];
            }
            if( nums[mid]<nums[start]){
                end=mid-1;
            }
            if(nums[mid]<nums[mid+1]) start=mid+1;
            else { 
                int ans=nums[mid];
                return ans;
            }
        }
        return nums[end];
    }
}
