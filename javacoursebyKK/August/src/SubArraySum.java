import java.util.*;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(sum(arr,4,1,5));
    }

    public static int sum(int[] arr,int n,int left,int right){
        int sum=0;
        int[] ans=new int[n*(n+1)/2];
        int k=0;
        for(int i=0;i<arr.length;i++){

            sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                ans[k++]=sum;

            }
        }
        Arrays.sort(ans);
        sum=0;
        for (int i = left-1; i <right ; i++) {
            sum+=ans[i];
        }
        return sum;
    }
}
