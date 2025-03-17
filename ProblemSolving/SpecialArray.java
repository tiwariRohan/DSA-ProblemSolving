import java.util.Arrays;
/*
 * you are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
 */
public class SpecialArray {
    public static void main(String[] args) {
        int[] nums={0,0,3,5,6,7,8};
        System.out.println(numOfElement(nums));
    }

    static int numOfElement(int[] nums){
       // System.out.println(Arrays.toString(nums));
        nums=mergeSort(nums);
        int remElement=nums.length;
        
        //System.out.println(Arrays.toString(nums)+remElement);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                remElement--;
                continue;
            }
           // System.out.println(remElement);
            if(nums[i]<=remElement){
                return remElement;
            }
            else remElement--;
        
        
        
    }
    return -1;
}

    static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    
    private static int[] merge(int[]  left,int[] right){
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length &&j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
                
            }
            else{
                   mix[k]=right[j];
                    j++; 
            }
            k++;
        }
        for (;i<left.length;i++) {
            mix[k]=left[i];
            k++;
        }
        for (;j<right.length;j++) {
            mix[k]=right[j];
            k++;
        }
        return mix;
    }
}
