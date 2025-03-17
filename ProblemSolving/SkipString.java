public class SkipString {
    public static void main(String[] args) {
        String str="bcappapplefg";
        System.out.println(skipAppNotApple(str));
    }
    static String removeString(String str){
        if(str.isEmpty()){
            return "";
        }
        //look this substring will skip this elemenets from the index it is passed
        if(str.startsWith("apple")){
            return removeString(str.substring(5));
        }
        else{
            return str.charAt(0)+removeString(str.substring(1));
        }
    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")&&!str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        else{
            return str.charAt(0)+skipAppNotApple(str.substring(1));
        }
    }
}

