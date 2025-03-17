public class DefangingString {
    public static void main(String[] args) {
        String str= "1.1.1.1";
        System.out.println(defangIPaddr(str));
    }
    /*1108. Defanging an IP Address */
    public static String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }
}
