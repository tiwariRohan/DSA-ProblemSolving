public class FindMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,9,3,1};
        System.out.println(mountainEle(arr));
    }
    public static int mountainEle(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;

            if (nums[mid]>nums[mid+1]) {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }


}
