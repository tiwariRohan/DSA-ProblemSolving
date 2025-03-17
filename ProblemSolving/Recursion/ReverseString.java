import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] str={'h','e','l','l','o'};
        reverseString(str);
        System.out.println(Arrays.toString(str));
    }
    public static void reverseString(char[] s) {
        helper(s, 0);
    }
    static void helper(char[] s,int index){
        if(index>=s.length-index)
            return;
        
        char temp=s[index];
        s[index]=s[s.length-index-1];
        s[s.length-index-1]=temp;
        helper(s, index+1);
     
    }
}
