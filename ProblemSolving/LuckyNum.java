import java.util.ArrayList;
import java.util.List;

public class LuckyNum {
    public static void main(String[] args) {
        int[][] mat={{1,10,4,2},{9,3,8,7},{15,16,17,12}};//[[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        System.out.println(luckyNumbers(mat));
    }
    //A lucky number is an element of the matrix such 
    //that it is the minimum element in its row and maximum in its column.
     public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int element;
        int min;
        int index=0;
        for (int i = 0; i < matrix.length; i++) {
                    element=matrix[i][0];
                    min=0;
            for (int j = 0; j < matrix[i].length; j++) {
                element=Math.min(element, matrix[i][j]);
                 if(element==matrix[i][j]){
                    index=j;
                }
            }
            min=element;
            System.out.println(min);

            // for (int j = 0; j < matrix.length; j++) {
            //     if(element==matrix[i][j]){
            //         index=j;
            //     }

            // }
             for (int j = 0; j < matrix.length; j++) {
                // if(element==matrix[i][j]){
                //     index=j;
                // }
                element=Math.max(element, matrix[j][index]);
            }

            //System.out.println(element);

            if (min==element) {
                list.add(min);
            }
            
        }
        return list;
    }

  
}
