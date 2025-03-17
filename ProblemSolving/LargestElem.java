
public class LargestElem {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){ 
                max=arr[i];
                }
            
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={4,7,8,6,7,6};
        System.out.println(largestElement(arr, 5));
    }
}

