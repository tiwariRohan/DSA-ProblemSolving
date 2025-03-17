public class QuePattern2 {
    public static void main(String[] args) {
        Pattern12(5);

    }
    static void Pattern6(int n){
        for(int row=1;row<=n;row++){

            int totalCol=row;
            int totalSpace=n-totalCol;
            for (int spaces = 1; spaces <= totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n){
        for(int row=1;row<=n;row++){

            int totalCol=n-row+1;
            int totalSpace=n-totalCol;
            for (int spaces = 1; spaces <= totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern8(int n){
        for(int row=1;row<=n;row++){

            int totalCol=2*row-1;
            int totalSpace=2*n-row+1;
            for (int spaces = 1; spaces <= totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern9(int n){
        for(int row=1;row<=n;row++){

            int totalCol=2*n-(2*row-1);
            int totalSpace=row;
            for (int spaces = 1; spaces <= totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern10(int n){
        for(int row=1;row<=n;row++){

            int totalCol=row;
            int totalSpace=n-row;
            for (int spaces = 1; spaces <=totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void Pattern11(int n){
        for(int row=1;row<=n;row++){

            int totalCol=n-row+1;
            int totalSpace=row;
            for (int spaces = 1; spaces <totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void Pattern12(int n){
        for(int row=1;row<=2*n;row++){

            int totalCol=row>n?row-n:n-row+1;
            int totalSpace=row>n?2*n-row+1:row;
            for (int spaces = 1; spaces <=totalSpace; spaces++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }




}
