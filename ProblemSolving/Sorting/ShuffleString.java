public class ShuffleString {
    public static void main(String[] args) {
        // "codeleet", indices = [4,5,6,7,0,2,1,3]
        String str="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str,indices));
    }
    public static String restoreString(String s, int[] indices) {
        //StringBuilder str=new StringBuilder();
        char[] Str=new char[s.length()];
        for (int i = 0; i < Str.length; i++) {
           Str[indices[i]]=s.charAt(i);//schar[indices[i]] = s[i];
        }
        return new String(Str);
    }
}
