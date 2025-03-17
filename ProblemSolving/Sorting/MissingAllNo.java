import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAllNo {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(allMissingNo(arr));
     }
    static List allMissingNo(int[] arr){
        List<Integer> missingNum=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            // if(arr[i]==arr.length){
            //     i++;
            //     continue;
            // }
            if(arr[i]-1!=i && arr[arr[i]-1]==arr[i]){
                i++;
                continue;
            }
            if(arr[i]-1!=i){
                swap(arr,i,arr[i]-1);
            }
            else i++;
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]-1!=j){
                missingNum.add(j+1);
            }
        }
        return missingNum;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
