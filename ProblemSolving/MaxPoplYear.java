public class MaxPoplYear {
    public static void main(String[] args) {
        int[][] logos={{1993,1999},{1998,2010},{2002,20012}};
        System.out.println(maxYear(logos));
    }
    public static int maxYear(int[][] logs){
        int count=0;
        int num;
        for (int i = 0; i < logs.length; i++) {
            for (int j = 1; j < logs.length; j++) {
                if(logs[i][1]-1>=logs[j][0]){
                    count++;
                }
                if(logs[j-1][1]>logs[j][0]){
                    count--;
                }
            }
            
        }
        return count;
    }
}
