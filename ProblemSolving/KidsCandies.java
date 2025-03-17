import java.util.ArrayList;
import java.util.List;
//extra candies in for kids and see if they have max candy after 
//taking all extra candies,if yes true else false
public class KidsCandies {
    public static void main(String[] args){
            int[] candies={2,5,3,1};
            int extra=3;
            System.out.println(extraCandy(candies, extra));
    }

    public static List<Boolean> extraCandy(int[] arr,int extra){
        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
       
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]+extra)>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
