public class CellesOdd {
    public static void main(String[] args) {
        int m=2, n=40;
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int matrix[][]= new int[m][n];
     for (int k=0; k<indices.length; k++) {
        // if(i<indices.length){
        int r=indices[k][0];
        int c=indices[k][1];
        if(k<m){
        for (int j = 0; j < n; j++) {
            matrix[r][j]++;
        }
        for (int j = 0; j < m; j++) {
            matrix[j][c]++;
        }
    }
    // }
       else{
        continue;
       }
        
     }
        
        int oddNum=0;
       
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]%2!=0){
                    oddNum++;
                }
            }
        }
    return oddNum;
}
}
