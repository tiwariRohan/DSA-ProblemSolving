import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
         long[] arr={4,7,3,6,7};
        System.out.println(Arrays.toString(getTriangle(arr, arr.length)));
    }
    public static long[] getTriangle(long arr[], long n)
    {   long[] ans=new long[(int)(n*(n+1))/2];
        return helper(arr,ans,n,arr.length-1,ans.length-1,0);
    }
        
    static long[] helper(long[] arr,long[] ans, long n, int index,int size,int count){
        ans[size]=arr[index];
        if(size==0){
            return ans;
        }
        
        if(index-count==0){
            return helper(arr,ans, n, arr.length-1,size-1,count+1);
        }

        else{
        arr[index]=arr[index]+arr[index-1];
        
        return helper(arr,ans, n, index-1,size-1,count);
        }
        
        
    }
}
