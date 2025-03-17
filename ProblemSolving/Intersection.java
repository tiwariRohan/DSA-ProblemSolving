import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersectionTwoArray(nums1, nums2)));
    }

    public static int[] intersectionTwoArray(int[] nums1, int[] nums2){
        int end=nums1.length>nums2.length?nums2.length:nums1.length;
        int k=0;
        int arr[]=new int[end];
        int low=0;
        int high=nums2.length-1;
        nums2=mergeSorting(nums2);
        System.out.println(Arrays.toString(nums2));
        for (int element:nums1) {
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums2[mid]>element){
                    high=mid-1;
                }
                if (nums2[mid]<element) {
                    low=mid+1;
                }
                else{
                    arr[k]=nums2[mid];
                    nums2[mid]=-11;
                    k++;
                }
            }
        }
        // int[] newArray = new int[k];
        // for (int i = 0; i<k; i++) {

        // newArray[i] = arr[i];
        // }
        return arr;
    }

    static int[]  mergeSorting(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSorting(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSorting(Arrays.copyOfRange(arr, mid, arr.length));

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
