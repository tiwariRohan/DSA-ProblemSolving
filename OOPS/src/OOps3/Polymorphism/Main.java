package OOps3.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("enter string:");
//        Scanner in= new Scanner(System.in);
//        String name;
//        name=in.nextLine();
//        int n;
//        System.out.println(name);
    Circle circle=new Circle();
    Shapes shapes=new Shapes();
    Shapes square=new Square();
    Shapes triangle=new Triangle();
    shapes.area();
    circle.area();
    square.area();
    triangle.area();
    }
}
