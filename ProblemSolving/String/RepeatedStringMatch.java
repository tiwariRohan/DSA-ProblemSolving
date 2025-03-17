
public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a="a";
        String b="aa";
        System.out.println(repeatedStringMatch(a, b));
    }
    public static int repeatedStringMatch(String a, String b) {
        return helper(a,b,0,0);
    }
    static int count=0;
    static int helper(String a, String b, int index1, int index2){
        if(index1==a.length()&&index2==0) return -1;

        if(index2==b.length()){
            return count;
        }
        if(index1==0){
            count++;
        }
        if(index1==a.length()){
            
            return helper(a, b, 0, index2);
        }
        char ch1=a.charAt(index1);
        char ch2=b.charAt(index2);
        if(ch1==ch2){
            return helper(a, b, index1+1, index2+1);
        }
        else{
            return helper(a, b, index1+1, index2);
        }
    }
}
