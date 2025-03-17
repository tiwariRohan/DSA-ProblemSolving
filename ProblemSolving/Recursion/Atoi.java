public class Atoi {
    public static void main(String[] args) {
        String s="-42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        long integer=helper(s,0,false);
        //boolean negative=false;
        
        if (integer > (Math.pow(2,31) - 1))
            return (int)Math.pow(2,31)-1;
        else if (integer < Math.pow(-2,31))
            return (int)Math.pow(-2,31);
        else return (int)helper(s,0,false);
    }
    static long helper(String s,long num,boolean neg){
        if(s.isEmpty()){
            if (neg){
               return num*(-1);
            }
            return num;
        }
        
        char ch=s.charAt(0);
        if(ch=='-'&&!neg){
            neg=true;
        }
        else if(ch<48||ch>57||ch=='-'){
            if (neg){
               return num*(-1);
            }
            return num;
        }

        else {
            num=num*10+(ch-'0');
        }
      return helper(s.substring(1),num,neg);
    }
}
