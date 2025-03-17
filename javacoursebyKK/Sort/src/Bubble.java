import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={32,1,4,0,5};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }

    }
}
