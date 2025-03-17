public class PerfectSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        System.out.println(perfectSum(arr,5,3));
    }
    static int count=0;
    public static  int perfectSum(int arr[],int n, int sum)
    {
        // Your code goes here

        perform(arr,0,sum);
        return count;

    }
    static void perform(int[] arr,int index,int sum){
        if(sum==0){
            count++;
            return ;
        }
        if(sum<0||index==arr.length){
            return ;
        }
        int val=arr[index];
        perform(arr,index+1,sum-val);
        perform(arr,index+1,sum);
    }
}
