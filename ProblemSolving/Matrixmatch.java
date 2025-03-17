public class Matrixmatch {
    
        public static void main(String[] args) {
            int arr[][] = { {0,0,0},{ 0,1,0}, { 1,1, 1 } };// [[0,0,0],[0,1,0],[1,1,1]]
            int[][] target = { {1,1,1},{ 0,1, 0 }, { 0, 0,0 }};// [[1,1,1],[0,1,0],[0,0,0]]
            System.out.println(match(arr, target));
        }
        public static int[][] rotation(int[][] mat) {
            int[][] newMat = new int[mat.length][mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int j = mat.length - 1, k = 0; j >= 0 && k < mat.length; k++, j--) {
                    newMat[i][k] = mat[j][i];
                }
            }
            return newMat;
        }

        public static boolean match(int[][] mat, int[][] target) {
            boolean check=true;
           // int count=3;
           int[][] newMat = new int[mat.length][];
            newMat=rotation(mat);
            for (int t = 1; t <=3; t++) {
                
             check=true;
            

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (target[i][j] != newMat[i][j]) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                break;
            }
            else{
               
                int[][] temp=new int[newMat.length][];
                temp=newMat;
                newMat=rotation(temp);
            }

        }
             return check;
        }
}
/*
 * class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        //check if target is equal to mat
        boolean abc= false;
        for(int i=0;i<4;i++){
             abc= check(mat,target);

             if(abc==true)
                 return true;
             else
                rotate(mat);
        }
        return false;
        }

        boolean check(int[][] mat,int[][]target){
            int n =mat.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]!=target[i][j])
                    return false;
                }
            }
            return true;
        }

      void rotate(int[][] matrix) {
        //transpose
    int n= matrix.length;
    for(int i=0;i<=n-2;i++){
        for(int j=i+1;j<=n-1;j++){
            int temp= matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]= temp;
        }
    }
    // reverse each of the rows 
    for(int[] arr: matrix){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
     }

     
    }


}
 */
