
public class BasicNum {
    public static void main(String[] args){
        fun(5);
        System.out.println();
        funrev(5);
        System.out.println("factorial:"+factorial(5));
        System.out.println("sum of digit:"+sumOfDigit(1342));

    }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
       

    }
    static void funrev(int n){
        if(n==0){
            return ;
        }
        
        funrev(n-1);
        System.out.println(n);

    }

    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }
    static int sumOfDigit(int n){
        if(n<1){
            return 0;
        }
        return n%10+sumOfDigit(n/10);
    }
}
