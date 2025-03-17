package OOps2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

     static void mesage(){
         System.out.println("you cannot use this inside static ");
//         System.out.println(age); you cannot use non-static var/objects
     }
    Human(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population +=1;
    }
}
