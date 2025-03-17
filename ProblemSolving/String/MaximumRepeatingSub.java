public class MaximumRepeatingSub {
    public  static int helper(String sequence, String word) {
        int c=0;
        String add=word;
        while(sequence.contains(word)==true)
        {
            c+=1;
            word=word+add;
            //System.out.println(word);
        }
        return c;
    }

    public static void main(String[] args) {
        String str="aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word="aaaba";
        System.out.println(helper(str, word));
    }
}
