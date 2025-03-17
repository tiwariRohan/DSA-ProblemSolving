import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr={2,5,2,1,2};
        List<List<Integer>> list=combinationSum2(arr,5);
        for(List<Integer> path:list){
            System.out.println(path);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findUniqueCombination(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
    static void findUniqueCombination(int[] arr,int index,int target,List<List<Integer>> ans,List<Integer> path){
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]) continue;;
            if(arr[i]>target) break;;

            path.add(arr[i]);
            findUniqueCombination(arr,i+1,target-arr[i],ans,path);
            path.remove(path.size()-1);
        }
    }
}
