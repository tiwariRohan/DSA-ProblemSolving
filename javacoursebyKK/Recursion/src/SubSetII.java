import java.util.*;

public class SubSetII {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetsWithDup(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    static  void helper(int[] nums,int index,List<List<Integer>> ans,List<Integer> path){

            ans.add(new ArrayList<>(path));



        for(int i=index;i<nums.length;i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;

            path.add(nums[index]);
            helper(nums, i + 1, ans, path);
            path.remove(path.size()-1);
//             helper(nums,index+1,ans,path);
        }
    }
}
