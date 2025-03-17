import java.util.Arrays;

public class Selection {
    public static void main(String[] args){
        int[] arr={5,4,7,6,0,3,2,1};
    sortingAlgorithm(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void sortingAlgorithm(int[] nums){
        //get the maximum element
        //swap it with the last index
        //repeat it till you get the solution
        
        //getting maximum element
        for (int i = 0; i < nums.length; i++) {
            int last=nums.length-i-1;
            int maxElement=getMaxIndex(nums,last+1);
            swap(nums,maxElement,last);
        }
        
        
    }
    static int getMaxIndex(int[] arr,int n){
        int max=0;
        //
            for (int j = 1; j < n; j++) {
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            
       
        return max;
    }
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    } 
}
