package OOps3.Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box1=new Box(4,5,6);
//        Box box2=new Box(box1 );
//        System.out.println(box1.h+" "+box1.w+" "+box1.l);
//        BoxWeight box3=new BoxWeight();
//        System.out.println(box3.h+" "+box3.weight);
//        BoxWeight box4=new BoxWeight(2,3,4,5);

        Box box5=new BoxWeight(2,3,6,3);
        System.out.println(box5.h);
        //there are many var in both parent and child classes
        //you are given access to var that are in the ref type i.e. Boxweight
        //hence, you should access to weight var
        // this also means that the ones you are trying to access should be initialised
        //but here , when the obj itself is of type parent class how will you call the constructor of child class
        //this is why error
//        BoxWeight box6=new Box(2,34,5);
        BoxPrice box8=new BoxPrice(2,3,4,5,6);
        System.out.println();
    }
}
