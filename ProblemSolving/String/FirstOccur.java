public class FirstOccur {
    static int count=0;
    public static int strStrHelper(String haystack, String needle,int count) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(haystack.startsWith(needle)){
            return count;
        }
        
        else {
            return strStrHelper(haystack.substring(1), needle,count+1);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(strStrHelper("leetcode", "leet",0));
    }
}
