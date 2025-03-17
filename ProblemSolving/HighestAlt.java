import java.util.Arrays;

public class HighestAlt {
    /*
    You are given an integer array gain of length n where gain[i] 
    is the net gain in altitude between points i​​​​​​ and i + 1 
    for all (0 <= i < n). Return the highest altitude of a point.
  */

  public static void main(String[] args) {
    int[] gain={-5,1,5,0,-7};
    System.out.println(largestAltitude(gain));
  }
    public static int largestAltitude(int[] gain) {
        int lar=0;
        int firstpoint=0;
        // int[] alti=new int[gain.length+1];
        // alti[0]=0;
        int maxx=0;
        for (int i = 1; i <=gain.length; i++) {
            lar=lar+gain[i-1];
            //alti[i]=lar;
            maxx=Math.max(maxx, lar);
            
            // lar=Math.max(lar, lar+gain[i]);
            // System.out.println(lar);
        }
        //System.out.println(Arrays.toString(alti));
        return maxx;
    }
}
