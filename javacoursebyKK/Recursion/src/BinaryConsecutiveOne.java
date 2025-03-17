public class BinaryConsecutiveOne {
    public static void main(String[] args) {
        consecutiveOne("",3);
    }
    static  void consecutiveOne(String p,int k){
        if (k  ==0) {
            System.out.println(p);
            return;
        }

        // Append '0' and recurse
        consecutiveOne(p + "0", k - 1);

        // Append '1' only if the previous character is not '1'
        if (p.isEmpty() || p.charAt(p.length() - 1) != '1') {
            consecutiveOne(p + "1", k - 1);
        }
    }

}
