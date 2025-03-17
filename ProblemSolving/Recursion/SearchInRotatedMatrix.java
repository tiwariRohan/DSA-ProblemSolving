public class SearchInRotatedMatrix {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(searching(arr, 0, arr.length-1, 0));
    }
    static int searching(int[] arr, int start, int end,int key){
        int mid=start+(end-start)/2;
        if(start>end) 
        { return -1;
        }

        if(arr[mid]==key) return mid;

        if(arr[start]<=arr[mid]){
            if(key>=arr[start] &&key<=arr[mid]) 
            {return searching(arr, start, mid-1, key);
            }
            else  return searching(arr, mid+1, end, key);
        }
        if(key>=arr[mid]&& key<=arr[end]) {
            return searching(arr, mid+1, end, key);
        }
        else return searching(arr, start, mid-1, key);

    }
}
