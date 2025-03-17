import java.util.Arrays;

public class Concatenation {

    public static void main(String[] args) {
        int[] ans={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(ans)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];

        for(int i=0,j=0;i<2*nums.length&&j<=nums.length;i++,j++){
            if(i!=2*nums.length&&j==nums.length){
                j=0;
            }
            ans[i]=nums[j];
            
        }
        return ans;
    }
}