import java.util.*;
import java.util.ArrayList;
public class GenParenthesis {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        generateParenthesis("",3,3,list);
        System.out.println(list);
    }
    static void generateParenthesis(String p,int open,int close,List<String> list){
       if(open==0&&close==0){
           list.add(p);
           return;
       }

       if(open!=0){
           String p1=p;
           p1+="(";
        generateParenthesis(p1,open-1,close,list);
       }

        if(open<close)
            generateParenthesis(p+")",open,close-1,list);

    }
}
