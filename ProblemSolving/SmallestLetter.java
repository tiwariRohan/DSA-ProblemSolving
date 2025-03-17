public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr={'x','x','y','y'};
        char target='z';
        System.out.println(greaterChar(arr, target));
    }
    public static char greaterChar(char[] arr,char target){
        int l=0;
        int h=arr.length-1;
        System.out.println(h);
        while (l<=h) {

            int mid=l+(h-l)/2;
            // System.out.println(arr[mid]);
            // System.out.println(h);
            if (arr[mid]>target) {
                h=mid-1;
            }
            if (arr[mid]<target) {
                l=mid+1;
            }
           // else return arr[mid];
        }
        return arr[l%arr.length];
    }
}
