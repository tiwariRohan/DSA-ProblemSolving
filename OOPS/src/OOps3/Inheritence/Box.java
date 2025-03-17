package OOps3.Inheritence;

public class Box {
   private double l;
    double h;
    double w;
//    double weight;
    Box () {
//        super();object class
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //cube
    Box(double side){
        this.w=side;
        this.h=side;
        this.l=side;
    }

     Box(double l, double h, double w) {
         System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w= old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
