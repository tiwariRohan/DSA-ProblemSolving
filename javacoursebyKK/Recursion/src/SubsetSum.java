import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        System.out.println(subsetSumCombination(list,3));
    }
    static  List<Integer> subsetSumCombination(List<Integer> arr,int n){
        List<Integer> ans=new ArrayList<>();
        sum(arr,n,0,0,ans);
        return ans;
    }
    static  void sum(List<Integer> arr,int n,int sum,int ind,List<Integer> ans){
        if(n==ind){
            ans.add(sum);
            return ;
        }



        sum(arr,n,sum+arr.get(ind),ind+1,ans);
        sum(arr,n,sum,ind+1,ans);

    }
}
