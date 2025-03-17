import java.util.Arrays;

public class SortTheSenetence {
    public static void main(String[] args) {
        String str="is2 sentence4 This1 a3";
        System.out.println(sortSentence(str));
    }
    static  String sortSentence(String s) {
        String[] str=s.split(" ");
       //s=null;
       // System.out.println(Arrays.toString(str));
       
        for (int i = 0; i < str.length; i++) {
            //char lastLetter = arrayOfStrings[i].charAt(arrayOfStrings[i].length() - 1);
            char temp=str[i].charAt(str[i].length()-1);
            if(temp!=i+1){
                str[i]=str[i].substring(0, str[i].length()-2);
                swap(str, i, temp);
            }
        }
        for (int i = 0; i < str.length; i++) {
            s+=str[i];
        }
        return s;
    }
    static void swap(String[] str,int first, int second){
        String temp=str[first];
        str[first]=str[second];
        str[second]=temp;
    }
}
