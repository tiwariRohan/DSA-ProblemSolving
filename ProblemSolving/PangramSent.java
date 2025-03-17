public class PangramSent {

    /*
     * A pangram is a sentence where every
     *  letter of the English alphabet appears at least once.

           
     Given a string sentence containing 
                 only lowercase English letters, return true 
               if sentence is a pangram, or false otherwis
     */

    // public static boolean checkIfPangram(String sentence) {
    //     int[] arr=new int[123];

    //      boolean exist=true;

    //     char charAtzero=sentence.charAt(0);
        
    //      for (int i = 0; i < sentence.length(); i++) {
    //          charAtzero=sentence.charAt(i);
    //         arr[charAtzero]=1;
        
    //      }

    //      for (int i = 97; i < arr.length; i++) {
    //         if(arr[i]==0){
    //             exist=false;
    //             break;
    //         }
    //      }

    //      return exist;
    //  }

     public static void main(String[] args) {
        String rohan="thequickbrownfoxjumpsoerthelazydog";
        System.out.println( checkIfPangram(rohan));

     }
    // class Solution {
        public static boolean checkIfPangram(String sentence) {
            int arr[] = new int[26];
            for(int i=0;i<sentence.length();i++)
            {
                arr[sentence.charAt(i)-'a']++;
                
            }
            System.out.println(arr[0]);
            for(int i=0;i<26;i++)
            {
                if(arr[i]==0)
                return false;
            }
    
            return true;
        }
    //}
}
