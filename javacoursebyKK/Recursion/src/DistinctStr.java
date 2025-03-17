public class DistinctStr {

        public static void main(String[] args){
            System.out.println(betterString("sqapzwbb","ljmolmti"));
            //sqapzwbb
        }
        public static String betterString(String str1, String str2) {
            // Code here
            int count=helper(str1,0);
            int count2=helper(str2,0);

            if(count>=count2){
                return str1;
            }
            else return str2;
        }
        static int helper(String str,int count){
            if(str.isEmpty()){
                return count;
            }
            char ch=str.charAt(0);
            if(!str.substring(1).contains(Character.toString(ch))){
                return helper(str.substring(1),count+1);
            }
            else {
                return helper(str.substring(1),count);
            }
        }
    }

