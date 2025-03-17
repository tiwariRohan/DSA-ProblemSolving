public class CheckPalindrome {
    public static void main(String[] args) {
        String str="Marge, let's \"[went].\" I await {news} telegram.";
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str){
        str=str.replace(" ", "");
        str=str.toLowerCase();
        str= removeSpecialCharacters(str);
        System.out.println(str);
        String ans="";
        if(str.length()==1) return true;
        for (int i = str.length()-1; i >=0; i--) {
            char ch=str.charAt(i);
            
            if(ch+0>=65&&ch+0<=90||ch+0>=97&&ch+0<=122|| ch+0>=46&&ch+0<=57){
              ans=ans+ch;
            }
        }
        if(ans.equals(str)){
            return true;
        }
        else return false;
    }
    public static String removeSpecialCharacters(String inputString) {
        // Define special characters
        String specialCharacters = "!@#$%^&*()-_+=[]{}|;:',.<>?/~`";

        // Initialize a StringBuilder to store the result
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            // Check if the character is not a special character
            if(currentChar=='"'){
                continue;
            }
            if (specialCharacters.indexOf(currentChar) == -1) {
                // Append non-special characters to the result StringBuilder
                resultBuilder.append(currentChar);
            }
        }

        // Convert StringBuilder to a string and return
        return resultBuilder.toString();
    }
}
