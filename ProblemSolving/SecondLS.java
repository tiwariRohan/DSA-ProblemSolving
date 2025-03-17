
import java.util.ArrayList;
import java.util.List;

public class SecondLS {
    public static void main(String[] args) {
        int[] arr={5,4,8,7,5,6,9};
        int n=arr.length;
        System.out.println(SecLargest(arr,n));
    }

    static int[] SecLargest(int[] a,int n){
        int min;
        
        for(int i=0;i<n;i++){
           min=i;
           for(int j=i+1;j<n;j++){ 
           if(a[min]>a[j]){
               min=j;
           }
           }
           swap(a,i,min);
        }
       
       return new int[]{a[1],a[n-2]};
   }

   static void swap(int[] a,int first,int second){
       int temp=a[first];
       a[first]=a[second];
       a[second]=temp;
   }
}
