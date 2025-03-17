public class MergeString {
    public  static String mergeAlternately(String word1, String word2) {
        String str="";
        int i=0,j=0;
        while (i<word1.length()&&j<word2.length()) {
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(j);
            str=str+ch1+ch2;
            i++;
            j++;
        }
        for(;i<word1.length();i++){
            char ch1=word1.charAt(i);
            str+=ch1;
        }
        for(;j<word2.length();j++){
            char ch1=word2.charAt(j);
            str+=ch1;
        }
        return str;
    }
    public static void main(String[] args) {
       String word1 = "abc";
       String word2 = "pqr";
       System.out.println(mergeAlternately(word1, word2));
    }
}
