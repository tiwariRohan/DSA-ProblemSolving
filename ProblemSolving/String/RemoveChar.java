public class RemoveChar {
    public static void main(String[] args) {
        String str="baccab";
        System.out.println(remove(str, 0));
    }
    static String ans="";
    static String remove(String str,int index){
        if(index==str.length()) return ans;
        char ch=str.charAt(index);
       
        if(ch=='a'){
            return remove(str, index+1);
        }
        else{
            ans=ans+ch;
            return remove(str, index+1);
        }
    }
}
