public class PatternQue {
    public static void main(String[] args) {
        //Pattern1(4);
        Pattern5(5);
    }
    // pattern que 1 
    static void Pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int totalColInRow=row>n?2*n-row:row;

            for (int col = 1; col <=totalColInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
