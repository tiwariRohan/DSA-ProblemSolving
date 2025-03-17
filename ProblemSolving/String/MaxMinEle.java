import java.util.Arrays;

public class MaxMinEle {
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        return helper(a, 0, 0);
        
    }
    static Pair helper(long[] arr,int min, int max){
        if(min==arr.length-1||max==arr.length-1){
            Pair a=new Pair(arr[min],arr[max]);
            return a;
        }
        if(arr[min]>arr[min+1]){
            swap(arr, min,min+1);
        }
        if(arr[max]<arr[max+1]){
            swap(arr, min, max);
        }
        return helper(arr,  min+1, max+1);
    }
    static void swap(long arr[],int first, int second){
        long temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,5,1};
        System.out.println();
        
    }
}

class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
