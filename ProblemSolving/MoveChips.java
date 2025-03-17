public class MoveChips {
    /*
     * We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position.
 In one step, we can change the position of the ith chip from position[i] to:
     */
    public static void main(String[] args) {
        int arr[]={2,3,3};
        System.out.println(minCostToMoveChips(arr));
    }
    public static int minCostToMoveChips(int[] position) {
        int n = position.length;
        int odd = 0;
        int even = 0;
        for(int i = 0; i < n; i++)
        {
         if( position[i] % 2 == 0)
         {
           even++;
         }
         else
         {
           odd++;
         }
        }
      
         return Math.min(odd, even);
    }
    // public static int minimum(int[] arr){
    //     int key=arr[0];
    //     int count=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         key=arr[i];
    //         int temp=count;
    //         count=0;
    //         for (int j = 0; j < arr.length; j++) {
    //               if (key==arr[j]) {
    //               count++;
    //         }
    //     }
    //     if (count>temp) {
    //             key=temp;
    //     }
    // }
    //     return key;
    // }
}
