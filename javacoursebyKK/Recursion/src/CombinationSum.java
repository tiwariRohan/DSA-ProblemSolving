import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr={2,3,6};
        List<List<Integer>> ans=helper(arr,7);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> helper(int[] arr, int target){
        List<List<Integer>>ans=new ArrayList<>();
        findCombination( arr,0,target,ans,new ArrayList<>());
        return ans;
    }
    static void findCombination(int[] arr, int index,int target,List<List<Integer>> ans,List<Integer> path){
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (path));
            }
            return;
        }
        if(arr[index]<=target){
            path.add(arr[index]);
            findCombination(arr,index,target-arr[index],ans,path);
            path.remove(path.size()-1);
        }
        findCombination(arr,index+1,target,ans,path);
    }
}
