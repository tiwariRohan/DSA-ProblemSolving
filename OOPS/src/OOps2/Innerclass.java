package OOps2;

public class Innerclass {
    static class Test {
        String name;

        public Test(String name) {
           this.name = name;
        }
    }


    public static void main(String[] args) {
        Test a=new Test("rohan");
        Test b=new Test("mohan");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
