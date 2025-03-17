import java.util.Arrays;

public class StartEndElem {
    public static void main(String[]  args){
        int[] arr={5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(index(arr, 9)));
    }
    public static int[] index(int[] nums, int target ){
      int arr[]=new int[2];
        arr[0]=search(nums, target, true);
        arr[1]=search(nums, target, false);
        return arr;
    }
     
    public static int search(int[] nums, int target, boolean findfirst){
        int l=0;
       int ans=-1;
        int h=nums.length-1;
        while (l<=h) {
            int mid=(l+h)/2;
            if (nums[mid]>target) {
                h=mid-1;//to check in half of the array on left to find first occurence
            }
            else if (nums[mid]<target) {
                l=mid+1;// to find last occurence
            }
            else{ ans=mid;
                if(findfirst)
                    h=mid-1;
                else l=mid+1;

            }
        }
        return ans;
    }

}
