public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        permutationSet("", str);
    }
    static void permutationSet(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first=p.substring(0,i);//range from [0,0)->zero time run first="";
            String s=p.substring(i,p.length());
            //System.out.println(first+s);
            permutationSet(first+ch+s, str.substring(1));
        }
    }
}
