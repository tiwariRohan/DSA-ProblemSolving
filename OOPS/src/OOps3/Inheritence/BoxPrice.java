package OOps3.Inheritence;

public class BoxPrice extends BoxWeight {
    double cost;
    BoxPrice(){
        super();
        this.cost=1;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }
    BoxPrice(double side,double weight){
        super(side,weight);
        this.cost=cost;
    }
}
