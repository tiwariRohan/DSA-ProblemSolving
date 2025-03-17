public class MatricxRotate {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1 }, { 0, 1 } };// [[0,0,0],[0,1,0],[1,1,1]]
        int[][] target = { { 1, 1 }, { 1, 0 } };// [[1,1,1],[0,1,0],[0,0,0]]
        System.out.println(match(arr, target));
    }

    public static boolean match(int[][] mat, int[][] target) {
        boolean check = true;
        int[][] newMat = rotation(mat);

       // int count = 3;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (target[i][j] != newMat[i][j]) {
                    check = false;
                    break;
                }
            }
        }
        if (!check) {
            // for (int p = 1; p <= count; p++) {

                int[][] newmatrix = new int[newMat.length][];
                
                    newmatrix = rotation(newMat);
                    check = true;

                    for (int i = 0; i < mat.length; i++) {
                        for (int j = 0; j < mat.length; j++) {
                            if (target[i][j] != newmatrix[i][j]) {
                                check = false;
                                break;
                            }
                        }

                    }  
        }

        return check;
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
}
