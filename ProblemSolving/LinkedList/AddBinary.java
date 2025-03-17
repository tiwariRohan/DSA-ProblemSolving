public class AddBinary {
    static String addBinaryStrings(String str1,String str2){
        // int num1=Integer.parseInt(str1);
        // int num2=Integer.parseInt(str2);
        // int i = Character.getNumericValue(c);
        int i=str1.length()-1,j=str2.length();
        int sum=0;
        int carry=0;
        while (i>=0||j>=0) {
            carry=0;
            char ch= str1.charAt(i);
            char ch1=str2.charAt(j);
            int n = Character.getNumericValue(ch);
            int n2= Character.getNumericValue(ch1);
            if(n==1 && n2==1){
                carry=1;
                
            }
            
        }
    }
}
