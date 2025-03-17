public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diaSum(arr));
    }
    public static int diaSum(int[][] matrix){
        int sum=0,k=matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                if(i==j){
                    sum=sum+matrix[i][j];
                }
            }
            for (int j = 0; j <1; j++) {
                if(i!=k){
                sum=sum+matrix[i][k];
                k--;
            }

            }
        }
        // if (matrix.length%2!=0) {
        //     sum=sum-matrix[matrix.length/2][matrix.length/2];
        // }

        return sum;
    
    }
}
