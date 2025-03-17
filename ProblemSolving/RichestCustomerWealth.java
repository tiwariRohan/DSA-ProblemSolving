import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args){
        int[][] arr={{1,5},{7,3},{3,5}};
        System.out.println(richestCust(arr));
    }
    static int richestCust(int[][] nums){
       
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                arr[i]+=nums[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int min=i;
             
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
                int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
            }
        }
        return arr[nums.length-1];
    }
}
