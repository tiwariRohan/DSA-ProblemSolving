public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr, 9));
    }
    public static int search(int[] nums, int target) {
        int l=0;
        int h=nums.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>target){
                h=mid-1;
            }
           else if(nums[mid]<target){
                l=mid+1;
            }
           else return mid;

        }
        return -1;
    }
}
