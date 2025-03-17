import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] alice={1,1};
        int[] bob={2,2};
        System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int arr[]=new int[2];
        int sum1=0;
        int sum2=0;
        int n=Math.max(aliceSizes.length, bobSizes.length);
        for (int i = 0; i < n; i++) {
            if (i<aliceSizes.length) {
                sum1+=aliceSizes[i];
            }
            if(i<bobSizes.length){
                sum2+=bobSizes[i];
            }
        }
        
        for (int i = 0; i < bobSizes.length; i++) {
            for (int j = 0; j < aliceSizes.length; j++) {
                if(sum2+aliceSizes[j]-bobSizes[i]==sum1+bobSizes[i]-aliceSizes[j]){
                    arr[0]=aliceSizes[j];
                    arr[1]=bobSizes[i];
                }
            }
        }
        return arr;
    }
}
