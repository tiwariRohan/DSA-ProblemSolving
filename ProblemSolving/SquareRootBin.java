public class SquareRootBin {
    public static void main(String[] args){
        int x=0;

        
        System.out.println(mysqrt(x));
    }
    public static int mysqrt(int x){
       int left=0;
       if(x==0 || x==1){
        return x;
    }
       //int[] arr=new int[x/2];
       int right=x;
        while (left<=right) {
            int mid=(left+right)/2;
            if(mid*mid<x){
                left=mid+1;
            }
            else if(mid*mid>x){
                right=mid-1;
            }
            else return mid;
        }
         
         return right; 
    }
}
