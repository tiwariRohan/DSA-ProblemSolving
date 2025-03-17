import java.util.Arrays;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }
    public static int arrangeCoins(int n){
       int start=1;
    //    int end=n;
       
       int x=n%2==0?n/2:n/2+1;
       int arr[]=new int[x+1];
       arr[0]=0;
       int max=0;
      for(int i=1;i<=x;i++){
        for (int j = 1; j<=i;j++ ) {
            if(n>=0){
                n=n-j;
                arr[i]=start;
                start++;
                
            }
            else break;
           
            
           // System.out.println(n);
            // if(n<0){
            //     break;
            // }
        }
        
      }
     System.out.println(Arrays.toString(arr));
      for (int i = 1; i < arr.length; i++) {
        if(arr[i]==i){
            max=Math.max(max, arr[i]);
        }
      }
       
        return max;
    }
}
