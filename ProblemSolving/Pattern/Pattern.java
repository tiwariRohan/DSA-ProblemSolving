
public class Pattern {
    public static void main(String[] args) {
        //pattern_1(5);
        pattern_9(5);
        pattern_8(5);
    }
    // pattern-9
    static void pattern_9(int n){
        int num=n;
        for (int row = 1; row<=n; row++) {
            
            for (int blnk = 1; blnk <row; blnk++) {
                System.out.print(" ");
            }
            for(int col=2*num-1;col>=1;col--){
                System.out.print("*");
                // num--;
            }
            for (int blnk = 1; blnk <row; blnk++) {
                System.out.print(" ");
            }
            num--;
            System.out.println();
        }
    }

    //pattern-8
    static void pattern_8(int n){
        // int print;
        // int blank;
        for (int row = 1; row<=n; row++) {
            for (int blnk = 1; blnk <=n-row; blnk++) {
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            for (int blnk = 1; blnk <=n-row; blnk++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    // pattern_6// pattern-7
    static void pattern_6(int n){
    //print blank space first
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        
        System.out.println();
    }
    }

    //pattern-5
    
    static void pattern_5(int n){
        int row=2*n;
        int col=n;
        for (int i = 1; i <row; i++) {
            if(i<=n)
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            else
                for (int j = 1; j <=col-(i-n); j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    //patern-1
    public static void pattern_1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern-2 pattern-3,4

    static void pattern_2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
