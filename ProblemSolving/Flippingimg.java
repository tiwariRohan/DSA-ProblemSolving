import java.util.Arrays;

public class Flippingimg {
    /*
     * To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0]
     */
    public static void main(String[] args) {
        int[][]  arr={{1,1,0},{0,1,0},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image[0].length];
        // int k=0;
        for(int i=0;i<image.length;i++){
            int k=0;
            for (int j = image.length-1; j >=0; j--) {
                ans[i][k]=(image[i][j]==1?0:1);
                k++;
            }
        }
        return ans;
    }
}
