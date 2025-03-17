import java.util.Arrays;

public class TargetArray {
    /*
    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */
        public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans=new int[nums.length];
            
            
        for (int i = 0; i < nums.length; i++) {
           
            ans[i]=nums[i];

            if(i==index[i])
             continue;

             else{
                if(i>index[i]){
                   for (int j = i; j<=index[i]; j--) {
                    ans[j]=ans[j-1];
                   }
                   ans[index[i]]=nums[i];
                }
                System.out.println(Arrays.toString(ans));
                
             }

        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }
}
