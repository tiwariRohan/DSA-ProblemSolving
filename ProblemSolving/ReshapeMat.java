import java.util.Arrays;

public class ReshapeMat {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        int r=1,c=4;
        System.out.println(Arrays.toString(reshape(arr, r, c)));
    }
    public static int[][] reshape(int[][] mat, int r, int c){
        int row=mat.length;
        int col=mat[0].length;
        int rows=0;
        int column=0;
    
        if(row*col==r*c){

        int[][] reshape=new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < col; j++) {
                
                reshape[rows][column]=mat[i][j];
                   column++;
                   if(column==c){
                    column=0;
                    rows++;
                   }
            
        }
    }
      return reshape;
       
    }

    return mat;
}
}
