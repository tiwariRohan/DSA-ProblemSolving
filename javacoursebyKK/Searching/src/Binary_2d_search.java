import java.util.Arrays;

public class Binary_2d_search {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,37,39,49},

        };
        int target=37;
        System.out.println(Arrays.toString(binary_search(arr,target)));
    }
    static int[] binary_search(int[][] matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while (row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};

            }
            if (matrix[row][col]>target){
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1};
    }
}
