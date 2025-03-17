import java.util.Arrays;

public class SkipSyring {
    public static void main(String[] args) {
        String str="baccda";
        System.out.println(skipElement(str, 0, "a"));
    }
      static StringBuilder keyELe;
    static StringBuilder skipElement(String str,int index,String key){

            if (index==str.length()) {
                return keyELe;
            }
            // if(str.charAt(index)==key){
            //    return skipElement(str, index+1, key);
            // }
            else{
                keyELe.append(str.charAt(index));
                return skipElement(str, index+1, key);
            }
    }
}
