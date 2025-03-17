import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        String[] str=s.split(" ");
       // System.out.println(Arrays.toString(str));
       String ans=reverse(str);
       
        return ans;
    }
    static String reverse(String[] str){
        String ans="";
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length()-1;j>=0; j--) {
                char ch=str[i].charAt(j);
            ans=ans+ch;
            }
            if(i!=str.length-1)
            ans=ans+" ";
            
        }
        return ans;
    }
}
