import java.util.ArrayList;

public class SubSet {
    public static void main(String[] args) {
         printSubSetOfString("", "abc");
       // System.out.println(subStringAsciiList("", "abc"));
       // subStringAscii("", "abc");
    }
     static void printSubSetOfString(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        printSubSetOfString(p+ch, str.substring(1));
        printSubSetOfString(p, str.substring(1));

     }
     static ArrayList<String> subString(String p,String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            if(p!=""){
           list.add(p);
            }
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String> left=subString(p+ch,str.substring(1));
        ArrayList<String> right=subString(p,str.substring(1));
        left.addAll(right);
        return left;
     }

     static void subStringAscii(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        subStringAscii(p, str.substring(1));
        subStringAscii(p+ch, str.substring(1));
        subStringAscii(p+(ch+0), str.substring(1));

     }
     static ArrayList<String> subStringAsciiList(String p,String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            if(p!=""){
           list.add(p);
            }
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String> left=subStringAsciiList(p+ch,str.substring(1));
        ArrayList<String> right=subStringAsciiList(p,str.substring(1));
        ArrayList<String> asci=subStringAsciiList(p+(ch+0),str.substring(1));
        left.addAll(right);
        left.addAll(asci);
        return left;
     }

}
