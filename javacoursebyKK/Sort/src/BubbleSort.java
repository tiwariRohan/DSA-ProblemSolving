import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // u need to compare two and then swap
        boolean sort=true;
        for (int i = 0; i < arr.length; i++) {

                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j - 1] > arr[j]) {
                        swap(arr, j - 1, j);
                        sort=false;
                    }
                }
                if(sort){
                    break;
                }
            }
        }


    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
