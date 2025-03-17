package Com.rohan.Introduction;

public class Main {
    public static void main(String[] args) {

        // stduent is now like a data type
        Student[] students=new Student[5];
       // just declaring
        Student kunal;
       // System.out.println(Arrays.toString(students));
        kunal=new Student();
        //new--> will assign memory to kunal dynamically means at runtime
        //instantiated
        // Com.rohan.Introduction.Student() --> is a constructor -->it defines by default constructor
       // kunal.rno=46;
        //kunal.marks=78.5f;
        //kunal.name="rohan";
        //System.out.println(kunal.marks);
        Student rohan=new Student();
      //  kunal.greeting();

        Student random=new Student(kunal);
        System.out.println(random.name);

        Student random2=new Student();
        System.out.println(random2.name);

    }
    //class is logical construct and
    // object is physical reality
    //instance variable inside the object

    //constructor is special function that runs when you create an object and it allocates some variable

}
class Student {
    int rno;
    String name;
    float marks;

    //we need a way to add the values of the above
    //properties object by object
    // we need one word to access every object

    void greeting(){
        System.out.println("hello my name is "+name);
    }
    //if you will not put this here the name= name will not understand whom to call
    //so ,either change the variable name or use this
    void changeName(String name){
        this.name=name;
    }

    Student(Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }

    Student(){
      /*  this.rno=13;
        this.name="kunal";
        this.marks=88.5f;*/

        //this is how you call a constructor from another constructor
        //here this will refer to student constructor
        //internally:new Com.rohan.Introduction.Student(46,"rohan",100.0f):
        this(46,"rohan",67.5f);
    }

    // sStudent rohan=new Com.rohan.Introduction.Student(46,"rohan",67);
    //here , this will be replaced with Arpit
    Student(int rno,String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;

    }
}