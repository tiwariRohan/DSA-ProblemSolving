import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
    int[] arr={5 ,3,4,2,1};
    selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length ; i++) {

        int last=arr.length-i-1;
        int correct_index=getmaxindex(arr,0,last);
        swap(arr,correct_index,last);

    }

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
    }

    static int getmaxindex(int[] arr,int start,int last){

          int  max=start;
           for (int j=1;j<=last;j++){
               if(arr[max]<arr[j]){
                   max=j;
               }
           }
           return max;
    }
}
