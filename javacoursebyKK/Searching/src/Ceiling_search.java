import java.util.Scanner;

public class Ceiling_search {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of the array:");
        int size;
        size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter elements of array");
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("enter elements u want  to search: ");
        int target=input.nextInt();
        int ans=Ceiling(arr,target);
        System.out.println("Ceiling is :"+ans);

    }

    static int Ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target){
                start=mid+1;
            }
            else {
               end=mid-1;
            }
        }
        return start;
    }
}

