public class BinaryString {
    public static void main(String[] args) {
        String str="0000";
        System.out.println(checkOnesSegment(str));
    }
    // form a contigious 
    public static boolean checkOnesSegment(String s) {
        // if(s.isEmpty()){
        //     return false;
        // }
        // //if(s.length()==1&&s.equals("1")) return true;
        // if(s.startsWith("11")){
        //     return true;
        // }

        // return checkOnesSegment(s.substring(1));
        // if(s.length()==1&&s.equals("1")) return true;
        
        //     if(s.contains("11")){
        //         return true;
        //     }
        // return false;
    //    for (int i = 0; i < s.length(); i++) {
    //         if()
    //    }

     if(s.isEmpty()){
            return false;
        }
        if(s.startsWith("1")){
            String str=s.substring(1);
            if(str.contains("01")) return false;
            //else 
            return true;
        }
        return checkOnesSegment(s.substring(1));
        
        //if it starts with
        // if(s.contains("1")){
        //     return false;
        // }
       // return checkOnesSegment(s.substring(1));
    //    for (int i = 0; i < s.length(); i++) {
    //             if(s.startsWith("1"))
    //        }
}
}

