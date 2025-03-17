import java.util.Arrays;

public class GoalParser {
    public static void main(String[] args) {
        String str="G()(al)";
        System.out.println(interpret2(str));
    }
    public static String interpret(String command) {
        String str="";
        
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='G'){
                str+="G";
            }
            if((command.charAt(i))=='('&&(command.charAt(i+1))==')'){
                str+="o";
            }
            if(command.charAt(i)=='('&&(command.charAt(i+1))=='a'){
                str+="al";
            }
        }
        return str;
    }

    static String interpret2(String a){
        // a.replaceAll("()", "o");
        // a.replace("(al)", "al");
        return a.replace("()", "o").replace("(al)", "al");
    }

}
