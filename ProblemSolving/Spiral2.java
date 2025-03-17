import java.util.Arrays;

public class Spiral2 {
    public static void main(String[] args) {
        int n=3;
        int[][] matrix=generateMatrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        
    }
    public static int[][] generateMatrix(int n) {
        int[][]  matrix=new int[n][n];
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        int count=0;
        // code 
        while (top<=bottom&&left<=right) {
            
        
        for (int i = left; i <=right; i++) {
            matrix[top][i]=count+1;
            count++;
        }
        top++;
        for (int i =top; i <=bottom; i++) {
            matrix[i][right]=count+1;
             count++;
        }
        right--;
        if(top<=bottom){
            for (int i =right; i>=left; i--) {
                matrix[bottom][i]=count+1;
                count++;
            }
            bottom--;
        }
        if(left<=right){
            for (int i = bottom; i >=top; i--) {
                matrix[i][left]=count+1;
                count++;
            }
            left++;
        }
    }

        return matrix;
    }
}
