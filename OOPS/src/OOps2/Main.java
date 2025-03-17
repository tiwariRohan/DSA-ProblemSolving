package OOps2;

public class Main {
    public static void main(String[] args) {
        // static method is not depend on objects
       /* Human kunal=new Human(12,"kunal",12000,false);
        Human rohan=new Human(20,"rohan",12000,false);
        System.out.println(Human.population);
        System.out.println(Human.population);*/
        // static is not depend on objects that's why we use static in main function
        // if you use non-static method in static method logically you are opposing my above note;
        // non-static methods are depend on instance ,it needs object
        Main funn=new Main();
        funn.fun2();
    }
    // this is not dependent on objects
    static void fun(){
        //you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances
       // greeting();
        //you cannot access non-static stuff without referencing their instances in
        // a static context
        Main obj=new Main();
        obj.greeting();

    }
    void fun2(){
        greeting();
    }
    // we know that something which is not static ,belongs to an object
    void greeting(){
        System.out.println("hello world");
    }
}
