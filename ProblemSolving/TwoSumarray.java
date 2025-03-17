import java.util.Arrays;

public class TwoSumarray {
    public static void main(String[] args) {
        int[] arr={-1,-1,1,1,1,1,1};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int ans[]={};
      int end=numbers.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if((numbers[mid]>target||numbers[end]>target )&&target>0) {
              end=end-1;
          }
         else {
             return sum(numbers,end,target);
            
          }
        
      }
      return ans;
  }
  public static int[] sum(int[] arr, int size,int target){
    int ans[]=new int[2];
    System.out.println(size);
    for (int i = 0; i <=size; i++) {
        for (int j = 1+i; j <=size; j++) {
            if(arr[i]+arr[j]==target){
                System.out.println(j);
                return new int[]{i+1,j+1};
            }
        }
    }
    return ans;
  }
}
