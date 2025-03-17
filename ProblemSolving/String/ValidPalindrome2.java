public class ValidPalindrome2 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("eedede"));
    }
    public static boolean validPalindrome(String s) {
      int left=0;
      int right=s.length()-1;
      int count=0;
      while(left<right){
       if(s.charAt(left)!=s.charAt(right)){
         if(count==1){
            return false;
         }
         return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
        }
        left++;
        right--;
    }
    
    return true;
}

// Helper method to check if string within given range is a palindrome
private static boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
    
       }
      }
    
