import java.util.*;

public class CombinationIII {
    public static void main(String[] args) {
        List<List<Integer>> ans=combinationSum3(3,9);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] nums={1,2,3,4,5,6,7,8,9};
        helper(nums,0,k,n,ans,new ArrayList<>());
        return ans;
    }

    static void helper(int[] nums,int index,int k, int n,List<List<Integer>> ans,List<Integer> path){
        if(k==0&&n==0){
            ans.add(new ArrayList<>(path));
            return;
        }

        if(k==0&&n!=0||k<0||index==nums.length) return;

        if(nums[index]<=n){
            path.add(nums[index]);
            helper(nums,index+1,k-1,n-nums[index],ans,path);
            path.remove(path.size()-1);
        }
        helper(nums,index+1,k,n,ans,path);
    }
}
