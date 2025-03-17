import java.util.Arrays;

public class Return {
    /*
     * You are given an integer ‘n’.



Your task is to return an array containing integers 
from 1 to ‘n’ (in increasing order) without using loops.


     */
  public static void main(String[] args) {
    int x=5;
    System.out.println(Arrays.toString(printNos(x)));
  }
  public static int[] printNos(int x) {
    // Write Your Code Here
    // int[] arr=new int[x];
    int n=0;
    if(x==1) {
        
    }
    
      return printNos(x-1);
    
    //  return arr;

}
}
