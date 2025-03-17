public class UpperCase {
    public static void main(String[] args) {
        String str="rohanTiwari";
        System.out.println(UpperCase(str));
    }
    static String UpperCase(String s){
        return s.toUpperCase();
    }
    static String geeks(String str){
        for (int i = 0; i < str.length(); i++) {
           // String ch=String.valueOf(str.charAt(i));
           char ch=str.charAt(i);
            if(ch>=65 && ch <=90){
                String s=ch+"";
                return s;
            }
        }
        return null;
    }
}
