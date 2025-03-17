import java.util.Scanner;

public class Floor_search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of the array :");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("enter elements o the araay :");
        for (int i = 0; i <size ; i++) {
            arr[i]=in.nextInt();

        }
        System.out.println("enter number to searh the floor of it:");
        int target=in.nextInt();
        int ans= Floor(arr,target);
        System.out.println("floor of the target is:"+ans);
    }
    static int Floor(int[] arr,int target){
        int s=0;
        int e=arr.length;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return e;
    }
}
