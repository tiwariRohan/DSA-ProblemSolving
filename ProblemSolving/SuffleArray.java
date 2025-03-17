import java.util.Arrays;

public class SuffleArray {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    System.out.println(Arrays.toString(suffle(arr)));
    }
    static int[] suffle(int[] arr){
        int[] ans=new int[arr.length];
        int count=arr.length/2-1;
        int cnt=0;
        for (int i = 0; i <arr.length; i++) {
           ans[i]= (i%2==0)?arr[i-cnt]:arr[i+count];
           if(i%2!=0){
            count--;
           }
           else{
            cnt++;
           }
           
        }
        return ans;
    }
//best solution
    // class Solution {
    //     public int[] shuffle(int[] nums, int n) {
    //         int arr[]=new int[2*n];
    //        int i=n,j=0;
    //        for(int k=0;i<2*n;k++){
    //            arr[k]=nums[j];
    //             k++;
    //             arr[k]=nums[i];
    //             i++;
    //             j++;
    //        }
    //         return arr;
    //     }
    // }
}
