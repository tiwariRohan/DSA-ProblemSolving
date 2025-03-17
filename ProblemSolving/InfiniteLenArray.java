public class InfiniteLenArray {

    public static void main(String[] args){
        int[] nums={12,13,14,15,16,17,18,19,20,21,22,23,24,26};

        System.out.println(searchIn(nums, 13));
    }
    public static int searchIn(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
           // int mid=start+(end-start)/2;
           
                int temp=start;
                start=end+1;
                end=end+(end-temp+1)*2;
                
           
        }
        

        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target ,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}