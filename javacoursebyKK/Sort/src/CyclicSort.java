import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]!=i+1){
                int find=getelement(arr,i+1);
                swap(arr,find,i);
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getelement(int[] arr,int target){
        for (int i = 1; i <=arr.length-1; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return 0;
    }
}
