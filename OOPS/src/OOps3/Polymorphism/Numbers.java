package OOps3.Polymorphism;

//import jdk.jfr.Unsigned;
//example of method overloading
//compile time polymorphism
public class Numbers {
    int sum(int a,int b){
        return a*b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
    int sum(int a,double b){
        System.out.println("double parameter called");
        return (int)(a+b);
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
       int a= obj.sum(3,4,5);// this is constructor overloading
       int b= obj.sum(3,2);// at compile time this will be check which method is
        // is used
        System.out.println(a+b);
    }
}
