public class RotedMatrix {
    public static void main(String[] args) {
       int[] arr={8,1,2};
       System.out.println(rotedpoint(arr));
        
    }
    public static int rotedpoint(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end= mid-1;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else return mid;
        }
        return start;
    }

}
