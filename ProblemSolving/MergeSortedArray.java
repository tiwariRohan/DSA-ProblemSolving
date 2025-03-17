import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int m=arr1.length;
        int[] arr2={4,5,6};
        int n=arr2.length;
        merging(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }
    public static void merging(int nums1[], int m,int nums2[],int n){
       for (int i = 0,j=m; i < n; i++) {
            nums1[j]=nums2[i];
            j++;
       }
       Arrays.sort(nums1);
}
}
