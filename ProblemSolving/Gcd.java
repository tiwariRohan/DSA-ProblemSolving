
public class Gcd {
    public static void main(String[] args) {
        int a=9,b=633;
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
