public class Binary_search {
    public static void main(String[] args) {
    int[] arr={2,4,34,54,65,75,97};
    int target=54;
    int ans=binary_search(arr,target);
        System.out.println(ans);
    }
    static int binary_search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target) {
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start=mid+1;
                }
            else
                return mid;
            }
        return -1;
        }
    }

