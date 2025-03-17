import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,7,8,4,5};
        sortingAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }
    //two part of array
    // sorting first two element
    // then three ,then four till last index
    static void sortingAlgorithm(int[] arr){
    for (int i = 1; i < arr.length; i++) {
        for (int j = i; j>0; j--) {
            if(arr[j]<arr[j-1]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
            else{
                break;
            }
            
        }

    }
    }
}
