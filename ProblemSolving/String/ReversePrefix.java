public class ReversePrefix {
    public static String reversePrefix(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            char chr=word.charAt(i);
            if(chr==ch){
            return reverse(word.substring(0, i+1), i)+word.substring(i+1,word.length());
            }
        }
        return word;
    }
    static String reverse(String str,int index){
        String word="";
        for (int i = index; i >=0; i--) {
            char ch=str.charAt(i);
            word+=ch;
        }
        return word;
    }
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdfgh", 'd'));
    }
}
