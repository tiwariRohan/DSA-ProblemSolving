import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums={1,1};
        System.out.println(Arrays.toString(missingElement(nums)));
    }
    static int[] missingElement(int[] arr){
        //int [] nums=new int[2];
        int i=0;
        while(i<arr.length){

            if(arr[i]-1!=i && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]-1!=j){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
