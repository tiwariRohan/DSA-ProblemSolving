import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
     public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            
            for (int j = i+1; j < nums.length-1; j++) {
               for (int j2 = j+1; j2 < nums.length; j2++) {
                  if(i!=j&&i!=j2 && j!=j2&&nums[i]+nums[j]+nums[j2]==0){
                    String tripletStr = nums[i] + "-" + nums[j] + "-" + nums[j2];
                    if(!seen.contains(tripletStr)){
                    ArrayList<Integer> rowList = new ArrayList<>();
                    rowList.add(nums[i]);
                    rowList.add(nums[j]);
                    rowList.add(nums[j2]);
                    
                    ans.add(rowList);

                    seen.add(tripletStr);
                   // break;
                    }
                  }
               } 

            }
        }
        return ans;
    }

}
